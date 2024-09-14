package com.spring.di;


import org.springframework.stereotype.Component;

@Component
public class Person implements Interfaceperson  {

    public void begin(){

        System.out.println("I am a person");
    }
}
