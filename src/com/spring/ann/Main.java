package com.spring.ann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");
        InterfaceMaster sport = context.getBean("master", InterfaceMaster.class);
        InterfaceMaster sport1 = context.getBean("master", InterfaceMaster.class);

        /*System.out.println(sport);
        System.out.println(sport1);
        System.out.println(sport==sport1);*/
        context.close();
    }
}
