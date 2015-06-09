package com.lukasdietrich.lambdatra.reaction.http;

import java.io.IOException;

import com.lukasdietrich.lambdatra.reaction.Adapter;
import com.lukasdietrich.lambdatra.session.SessionStore;

/**
 * {@link Adapter} for {@link HttpCallback}
 * 
 * @author Lukas Dietrich
 *
 */
public class HttpAdapter<S> extends BaseHttpAdapter<S, HttpCallback<S>>{

	public HttpAdapter(HttpCallback<S> callback, SessionStore<S> sessions) {
		super(callback, sessions);
	}

	@Override
	protected boolean handle(WrappedRequest<S> req, WrappedResponse<S> res) throws IOException {
		getCallback().call(req, res);
		return true;
	}

}
