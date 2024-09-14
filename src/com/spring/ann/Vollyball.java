package com.spring.ann;

import org.springframework.stereotype.Component;

@Component
public class Vollyball  implements Sport{
    public  void sportType(){

        System.out.println("Vollyball");
    }
}
