package com.javaacademy.lessons.homework.myhwork3.ex2;

import com.javaacademy.lessons.homework.myhwork3.ex2.fruits.Apple;
import com.javaacademy.lessons.homework.myhwork3.ex2.fruits.Apricot;
import com.javaacademy.lessons.homework.myhwork3.ex2.fruits.Fruit;

public class Runner {
    public static void main(String[] args) {

        Garden appleFarm = () -> "growth " + new Apple();
        Garden apricotFarm = () -> "growth " + new Apricot();

        System.out.println(appleFarm.growth());
        System.out.println(apricotFarm.growth());
    }
}
