package com.geekbrains.lesson1;

public class Cat {
    String name;
    String color;
    int age;

    public Cat (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void meow(){
        System.out.println(name + " meaw");
    }

    public void info(){
        System.out.println(name + " "+color+" "+age);
    }
}