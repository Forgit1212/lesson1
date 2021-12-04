package com.geekbrains.lesson1;

public abstract class Animals {
    public String name;
    public String color;
    public int age;
    //int prep;

    public Animals(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
        //this.prep = prep;
    }

    public void swim(int prep){
        System.out.println(name+" "+"не умеет плавать");
    };

    public abstract void run(int prep);
}
