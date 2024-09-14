package com.spring.ann;

import org.springframework.stereotype.Component;

@Component
public class Tennis implements Sport{
    public  void sportType(){

        System.out.println("Tennis");
    }
}
