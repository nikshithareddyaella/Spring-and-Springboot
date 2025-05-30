package org.example;


public class Dev {
    private int age;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    private Computer comp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev(int age) {    //Parameterised constructor
        this.age = age;
        System.out.println("Dev parameterised constructor constructor"+age);
    }

    public Dev(){
        System.out.println("Dev constructor");
    }  //Constructor


    public void build(){
        comp.compile();
        System.out.println("Working on dev components");
    }
}
