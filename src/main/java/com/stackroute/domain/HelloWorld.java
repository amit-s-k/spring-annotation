package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private String msg="helloworld";
    public String getMessage(){
        return msg;
    }
}
