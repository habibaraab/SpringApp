package com.spring.di;

public class User implements InterfaceUser{

    private  Interfaceperson person;
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
