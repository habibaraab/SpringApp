package com.spring.ioc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainn {
    public static void main(String[] args) {


        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");
        // retrieve bean from spring container
        Sport foot = context.getBean("mysport",Sport.class);
        foot.start();
        context.close();

        Sport ob = new Football();
        ob.start();
    }
}
