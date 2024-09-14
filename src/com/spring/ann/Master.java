package com.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Master implements InterfaceMaster{

    @Autowired
    @Qualifier("tennis")
    private Sport sport;




    public void start(){

        System.out.println("I am master");
    }

    public void getSport(){
        this.sport.sportType();
    }
}
