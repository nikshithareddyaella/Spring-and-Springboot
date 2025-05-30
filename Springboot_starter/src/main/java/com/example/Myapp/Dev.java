package com.example.Myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired                    //field injection
    @Qualifier("desktop") //@Qualifier("laptop")
    private Computer comp;

//    public Dev(Laptop laptop){  // Constructor injection
//        this.lap=laptop;
//    }

//    @Autowired
//    public void setter(Laptop laptop){ //Setter injection
//        this.lap=laptop;
//    }

    public void build(){
        comp.compile();
        System.out.println("Working on dev components");
    }
}
