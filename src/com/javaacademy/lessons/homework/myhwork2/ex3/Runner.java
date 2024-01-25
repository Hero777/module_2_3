package com.javaacademy.lessons.homework.myhwork2.ex3;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Detail saw = new Detail("Пила");
        Detail hummer = new Detail("Молоток");
        Detail screw = new Detail("Отвертка");

        Map<Detail, Integer> details = new HashMap<>();
        details.put(saw, 1);
        details.put(hummer, 2);
        details.put(screw, 3);

        System.out.println(details);
    }
}
