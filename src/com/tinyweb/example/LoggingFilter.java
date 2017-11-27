package com.tinyweb.example;

import com.tinyweb.Filter;
import com.tinyweb.HttpRequest;

/**
 * Created by hessam on 11/24/17.
 */
public class LoggingFilter implements Filter{

    @Override
    public HttpRequest doFilter(HttpRequest request) {
        System.out.println("In Logging Filter - request for path: " + request.getPath());
        return request;
    }
}
