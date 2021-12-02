package com.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "white", 2);
        Cat cat2 = new Cat("Murzik", "black", 4);
        cat.info();
        cat2.info();
    }
}
