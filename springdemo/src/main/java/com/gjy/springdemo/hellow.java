package com.gjy.springdemo;

public class hellow {

    private String name;
    private String action = "playing";

    public hellow(){
        System.out.println("hellow constructed ！ Doing:" + action);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("Hello"+ name);
    }

    public void init(){
        System.out.println("Doing Initializing!");
    }

    public void destroy(){
        System.out.println("Bean has bean Destroyed");
    }
}
