package com.tinyweb;

/**
 * Created by hessam on 11/24/17.
 */
public interface Filter {

    public HttpRequest doFilter(HttpRequest request);
}
