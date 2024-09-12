package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");
        // retrieve bean from spring container
       // Interfaceperson person= context.getBean("person",Interfaceperson.class);


        InterfaceUser user= context.getBean("user",InterfaceUser.class);

      //  person.begin();
        user.getPerson();


        context.close();




    }
}
