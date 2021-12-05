package com.geekbrains.lesson1;

import com.geekbrains.lesson1.An.Cat;
import com.geekbrains.lesson1.An.Dog;

import java.util.ArrayList;

public class MainApp {


    public static void main(String[] args) {
        ArrayList<Animals> animals = new ArrayList<Animals>();
        Cat cat = new Cat("Barsik", "white", 2);
        animals.add(cat);
        Cat cat2 = new Cat("Murzik", "black", 4);
        animals.add(cat2);
        Dog dog1 = new Dog("Tosha", "white", 15);
        animals.add(dog1);
        cat.info();
        cat2.info();
        cat2.swim(250);
        cat.run(200);
        dog1.swim(5);

        System.out.println(animals);

        int qCat = 0;
        int qDog = 0;

        for(Animals animal : animals){
            animal.swim(3);
            animal.run(150);
            if (animal instanceof Cat){
                qCat++;

            }else if(animal instanceof Dog){
                qDog++;

            }
        }
        System.out.println("qCat="+qCat);
        System.out.println("qDog="+qDog);
    }
}
