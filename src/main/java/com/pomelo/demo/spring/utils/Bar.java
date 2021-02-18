package com.pomelo.demo.spring.utils;

import org.springframework.stereotype.Component;

@Component
public class Bar implements Foo {

    @Override
    public String display(String name) {
        return String.format("Hello %s!", name);
    }

}
