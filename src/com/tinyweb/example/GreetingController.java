package com.tinyweb.example;

import com.tinyweb.HttpRequest;
import com.tinyweb.TemplateController;
import com.tinyweb.View;

import java.util.*;

/**
 * Created by hessam on 11/24/17.
 */
public class GreetingController extends TemplateController {

    private Random random;

    public GreetingController(View view){
        super(view);
        random = new Random();
    }

    @Override
    protected Map<String, List<String>> doRequest(HttpRequest httpRequest) {
        Map<String,List<String>> hellomodel = new HashMap<>();
        hellomodel.put("greetings",generateGreetings(httpRequest.getBody()));
        return hellomodel;
    }

    private List<String> generateGreetings(String namesCommaSeparated){
        String[] names = namesCommaSeparated.split(",");
        List<String> greetings = new ArrayList<>();
        for(String name: names)
            greetings.add(makeGreeting(name));
        return greetings;
    }

    private String makeGreeting(String name){
        String[] greetings = {"Hello","Greetings","Salutations","Hola","Hej"};
        String greetingPrefix = greetings[random.nextInt(5)];
        return String.format("%s, %s", greetingPrefix, name);
    }
}
