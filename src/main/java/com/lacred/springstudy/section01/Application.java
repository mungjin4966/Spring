package com.lacred.springstudy.section01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new GenericApplicationContext("main/resources/spring-context.xml");
    }
}
