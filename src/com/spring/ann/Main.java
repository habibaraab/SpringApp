package com.spring.ann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");
        InterfaceMaster sport = context.getBean("master", InterfaceMaster.class);
        sport.getSport();
    }
}
