package com.example.Myapp;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Laptop method compile");
    }
}
