package com.tinyweb;

import java.util.Map;

/**
 * Created by hessam on 11/24/17.
 */
public class HttpRequest {

    private final String body;
    private final Map<String,String> headers;
    private final String path;

    public String getBody() {
        return body;
    }

    public Map<String,String> getHeaders() {
        return headers;
    }

    public String getPath() {
        return path;
    }

    public HttpRequest(Builder builder){
        this.body = builder.body;
        this.headers = builder.headers;
        this.path = builder.path;
    }

    public static Builder builderFrom(HttpRequest request){
        Builder builder = new Builder();
        builder.path(request.getPath());
        builder.body(request.getBody());
        Map<String,String> headers = request.getHeaders();
        for(String headerName : headers.keySet())
            builder.addHeader(headerName,headers.get(headerName));
        return builder;
    }

    public static class Builder{

        public String body;
        public Map<String,String> headers;
        public String path;

        public Builder body(String body){
            this.body = body;
            return this;
        }

        public Builder headers(Map<String,String> headers){
            this.headers = headers;
            return this;
        }

        public Builder path(String path){
            this.path = path;
            return this;
        }

        public HttpRequest build(){
            return new HttpRequest(this);
        }

        public static Builder newBuilder(){
            return new Builder();
        }

        public void addHeader(String headerName, String headerBody){
            headers.put(headerName,headerBody);
        }
    }
}
