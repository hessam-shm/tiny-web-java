package com.tinyweb;

import com.tinyweb.example.GreetingController;
import com.tinyweb.example.GreetingRenderingStrategy;
import com.tinyweb.example.LoggingFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hessam on 11/24/17.
 */
public class ExampleApp {
    public static void main(String[] args) {
        String commaSeparatedNames = "A,B,C,D";
        Map<String,Controller> controllers = new HashMap<>();
        controllers.put("localhost/home",new GreetingController(new StrategyView(new GreetingRenderingStrategy())));
        List<Filter> filters = new ArrayList<>();
        filters.add(new LoggingFilter());
        TinyWeb tinyWeb = new TinyWeb(controllers,filters);
        HttpRequest request = HttpRequest.Builder.newBuilder().path("localhost/home").body(commaSeparatedNames).build();
        tinyWeb.handleRequest(request);
    }
}
