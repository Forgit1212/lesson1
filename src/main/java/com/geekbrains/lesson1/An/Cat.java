package com.geekbrains.lesson1.An;

import com.geekbrains.lesson1.Animals;

public class Cat extends Animals {

    private final int prep = 200;

    public int getPrep() {
        return prep;
    }

    public Cat (String name, String color, int age){
        super(name, color, age);

    }

    public void meow(){
        System.out.println(name + " meaw");
    }

    public void info(){
        System.out.println(name + " "+color+" "+age);
    }

    @Override
    public void run(int fprep) {
        if (fprep<=prep){
            System.out.println("cat"+name+" "+"пробежал"+" "+fprep+ " м");
        }else {
            System.out.println("cat"+name+" "+"не пробежит"+" "+fprep+ " м");
        }
    }

    @Override
    public String toString(){
        return "Cat ["+name+"] ";
    }
}
