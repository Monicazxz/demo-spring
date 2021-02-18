package com.pomelo.demo.spring.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StaticUtil {

    private StaticUtil() {

    }

    private static Foo foo;

    @Autowired
    public void setFoo(Foo foo) {
        StaticUtil.foo = foo;
        System.out.println("spring");
    }

    static {
        foo = null;
        System.out.println("static");
    }

    public static String display(String name) {
        return foo.display(name);
    }
}
