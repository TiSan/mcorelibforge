package com.lukasdietrich.lambdatra.reaction.http;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders.Names;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.cookie.Cookie;
import io.netty.handler.codec.http.cookie.DefaultCookie;
import io.netty.handler.codec.http.cookie.ServerCookieEncoder;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Vector;

import com.lukasdietrich.lambdatra.session.SessionStore;

/**
 * Wraps {@link HttpResponse} into a simpler class.
 * 
 * @author Lukas Dietrich
 *
 */
public final class WrappedResponse<S> extends OutputStream {

	private WrappedRequest<S> req;
	private FullHttpResponse res;
	private SessionStore<S> sessions;
	
	private List<Cookie> cookies;
	
	public WrappedResponse(WrappedRequest<S> req, FullHttpResponse res, SessionStore<S> sessions) {
		this.req = req;
		this.res = res;
		this.sessions = sessions;
		this.cookies = new Vector<>();
	}
	
	/**
	 * Applies <i>cached</i> header values
	 */
	protected void applyHeader() {
		setHeader(Names.SET_COOKIE, ServerCookieEncoder.LAX.encode(cookies));
	}
	
	/**
	 * Sets an arbitrary header
	 * 
	 * @param key header name
	 * @param value header value
	 */
	public void setHeader(String key, String value) {
		res.headers().set(key.toString(), value);
	}
	
	/**
	 * Sets an arbitrary header
	 * 
	 * @param key header name
	 * @param values list of values
	 */
	public void setHeader(String key, Iterable<String> values) {
		res.headers().set(key, values);
	}
	
	/**
	 * Sets headers for {@link HttpResponseStatus}
	 * 
	 * @param status header statuscode
	 */
	public void setStatus(HttpResponseStatus status) {
		res.setStatus(status);
	}
	
	/**
	 * Sets headers for mime type
	 * 
	 * @param mime content type
	 */
	public void setMime(String mime) {
		setHeader(Names.CONTENT_TYPE, mime);
	}
	
	/**
	 * Sets headers for cache-control with the given 
	 * expiration date in seconds.
	 * 
	 * @param expires expiration in seconds
	 */
	public void enableCache(long expires) {
		setHeader(Names.CACHE_CONTROL, String.format("max-age=%d", expires));
	}
	
	/**
	 * Sets headers to store a cookie.
	 * <br>
	 * <i>Multiple calls will be merged to one header field!</i>
	 * 
	 * @param cookie cookie to be set
	 */
	public void setCookie(Cookie cookie) {
		cookies.add(cookie);
	}
	
	/**
	 * Starts a session and sets the corresponding
	 * session id as a cookie
	 * 
	 * @param value session value
	 */
	public void startSession(S value) {
		Cookie cookie = new DefaultCookie(sessions.getCookieKey(), sessions.startSession(value));
		cookie.setPath("/");
		setCookie(cookie);
	}
	
	/**
	 * Invalidates the current session id, if any is present.
	 */
	public void stopSession() {
		req.getSessionId().ifPresent(c -> sessions.stopSession(c.value()));
	}
	
	/**
	 * Returns a {@link ByteBuf} to write output to.
	 * 
	 * @return response buffer
	 */
	protected ByteBuf getBuffer() {
		return res.content();
	}

	/**
	 * Writes text to the {@link ByteBuf}.
	 * 
	 * @param text utf8 encoded text to be written
	 */
	public void write(String text) {
		ByteBufUtil.writeUtf8(getBuffer(), text);
	}
	
	@Override
	public void write(int b) throws IOException {
		getBuffer().writeByte(b);
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		getBuffer().writeBytes(b, off, len);
	}

	@Override
	public void write(byte[] b) throws IOException {
		getBuffer().writeBytes(b);
	}
	
}
