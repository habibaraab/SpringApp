package com.spring.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("user")
public class User implements InterfaceUser{
    private Interfaceperson person;

    @Autowired
    public void setPerson(Interfaceperson person) {
        this.person = person;
    }





    public void start(){

        System.out.println("I am user");
    }

    public void getPerson(){
        this.person.begin();
    }


}
