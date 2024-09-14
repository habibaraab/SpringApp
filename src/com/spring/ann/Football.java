package com.spring.ann;

import org.springframework.stereotype.Component;

@Component
public class Football implements Sport{
    public  void sportType(){

        System.out.println("Football");
    }
}
