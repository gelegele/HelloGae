package com.gelegele.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void getLoginURL(AsyncCallback<String> callback);
	void getCurrentUserID(AsyncCallback<String> callback);
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
