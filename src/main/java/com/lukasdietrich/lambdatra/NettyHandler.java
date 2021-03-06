package com.lukasdietrich.lambdatra;

import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

import com.lukasdietrich.lambdatra.routing.Route;
import com.lukasdietrich.lambdatra.routing.Router;

/**
 * Request handler middleware for underlying
 * Netty Framework
 * 
 * @author Lukas Dietrich
 *
 */
public class NettyHandler extends SimpleChannelInboundHandler<Object> {
	
	private Router router;
	private BiConsumer<ChannelHandlerContext, WebSocketFrame> wshandler;
	
	public NettyHandler(Router router) {
		this.router = router;
	}
	
	public void onWsFrame(BiConsumer<ChannelHandlerContext, WebSocketFrame> listener) {
		this.wshandler = listener;
	}
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
		if (msg instanceof FullHttpRequest) {
			handleHTTP(ctx, (FullHttpRequest) msg);
			return;
		}
		
		if (msg instanceof WebSocketFrame) {
			handleWebSocket(ctx, (WebSocketFrame) msg);
			return;
		}
	}
	
	private void handleHTTP(ChannelHandlerContext ctx, FullHttpRequest req) throws IOException {
		for (Entry<Route<?>, Map<String, String>> route : router.findRoute(req.getUri().split("\\?")[0])) {
			if (route.getKey().getAdapter().call(this, ctx, req, route.getValue()))
				return;
		}
		
		FullHttpResponse notFound = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NOT_FOUND);
		ByteBufUtil.writeUtf8(notFound.content(), "Not found.");
		
		ctx.writeAndFlush(notFound);
		ctx.close();
	}
	
	private void handleWebSocket(ChannelHandlerContext ctx, WebSocketFrame frame) {
		if (wshandler != null) 
			wshandler.accept(ctx, frame);
	}

}
