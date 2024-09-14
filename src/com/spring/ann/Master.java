package com.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Master implements InterfaceMaster{

    @Autowired
    @Qualifier("vollyball")
    private Sport sport;




    public void start(){

        System.out.println("I am master");
    }

    public void getSport(){
        this.sport.sportType();
    }
}
