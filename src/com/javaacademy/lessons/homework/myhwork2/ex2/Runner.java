package com.javaacademy.lessons.homework.myhwork2.ex2;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Item itemApple = new Item("Яблоко");
        Item itemBanana = new Item("Банан");
        Item itemOrange = new Item("Апельсин");

        Map<Item, Integer> vItems = new HashMap<>();

        vItems.put(itemApple, 1);
        vItems.put(itemBanana, 2);
        vItems.put(itemOrange, 3);

        System.out.println(vItems);
        System.out.println(vItems.get(itemOrange));
    }
}
