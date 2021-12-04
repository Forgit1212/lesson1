package com.geekbrains.lesson1;

import com.geekbrains.lesson1.An.Cat;
import com.geekbrains.lesson1.An.Dog;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "white", 2);
        Cat cat2 = new Cat("Murzik", "black", 4);
        Dog dog1 = new Dog("Tosha", "white", 15);
        cat.info();
        cat2.info();
        cat2.swim(250);
        cat.run(200);
        dog1.swim(5);
    }
}
