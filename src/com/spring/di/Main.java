package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");
        // retrieve bean from spring container
       // Interfaceperson person= context.getBean("person",Interfaceperson.class);


        User user= context.getBean("user",User.class);

        user.start();
      //  person.begin();
       // user.getPerson();

        context.close();




    }
}
