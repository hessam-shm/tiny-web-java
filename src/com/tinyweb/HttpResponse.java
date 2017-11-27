package com.tinyweb;

/**
 * Created by hessam on 11/24/17.
 */
public class HttpResponse {

    private final String body;
    private final Integer responseCode;

    public String getBody() {
        return body;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public HttpResponse(Builder builder){
        body = builder.body;
        responseCode = builder.responseCode;
    }

    public static class Builder{

        private String body;
        private Integer responseCode;

        public Builder body(String body){
            this.body = body;
            return this;
        }

        public Builder responseCode(Integer responseCode){
            this.responseCode = responseCode;
            return this;
        }

        public HttpResponse build(){
            return new HttpResponse(this);
        }

        public static Builder newBuilder(){
            return new Builder();
        }
    }
}
