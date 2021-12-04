package com.geekbrains.lesson1.An;

import com.geekbrains.lesson1.Animals;

public class Dog extends Animals {
    private final int prep = 500;
    private final int prepSwim = 10;

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int fprep) {
        if (fprep<=prep){
            System.out.println("dog"+name+" "+"пробежал"+" "+fprep+ " м");
        }else {
            System.out.println("dog"+name+" "+"не пробежит"+" "+fprep+ " м");
        }
    }

    @Override
    public void swim(int swimPrep) {
        if (swimPrep<=prepSwim){
            System.out.println(name+" "+"проплыл"+" "+swimPrep+ " м");
        }else {
            System.out.println(name+" "+"не проплывет"+" "+swimPrep+ " м");
        }
    }
}
