package com.javaacademy.lessons.homework.myhwork1.ex3;

public class Item {
    private String nameOfThing;

    public Item(String nameOfThing) {
        this.nameOfThing = nameOfThing;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nameOfThing='" + nameOfThing + '\'' +
                '}';
    }
}
