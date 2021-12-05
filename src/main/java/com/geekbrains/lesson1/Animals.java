package com.geekbrains.lesson1;

import java.util.ArrayList;

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

    public void add(Animals animals){
        animals.add(animals);
    }

    public void swim(int prep){
        System.out.println(name+" "+"не умеет плавать");
    };

    public abstract void run(int prep);
}
