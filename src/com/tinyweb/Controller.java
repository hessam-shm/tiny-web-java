package com.tinyweb;

/**
 * Created by hessam on 11/24/17.
 */
public interface Controller {

    public HttpResponse handleRequest(HttpRequest httpRequest);
}
