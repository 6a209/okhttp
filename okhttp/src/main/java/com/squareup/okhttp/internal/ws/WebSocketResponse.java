package com.squareup.okhttp.internal.ws;

import com.squareup.okhttp.Response;

public final class WebSocketResponse {
  private final Response response;
  private final WebSocket webSocket;

  WebSocketResponse(Response response, WebSocket webSocket) {
    this.webSocket = webSocket;
    this.response = response;
  }

  public Response response() {
    return response;
  }

  public WebSocket webSocket() {
    return webSocket;
  }
}
