package com.javaacademy.lessons.homework.myhwork3.ex4;

import java.util.function.Consumer;

public class Runner {
    public static void main(String[] args) {
        Wood woodFuel = new Wood();
        Uran uranFuel = new Uran();

        Consumer<Fuel> burning = (fuel) -> {
            if (fuel instanceof Wood) {
                System.out.println("Желто-красный свет вокруг!");
            } else if (fuel instanceof Uran) {
                System.out.println("Зеленый свет вокруг!");
            }
        };

        Consumer<Uran> atomicReactor = (uran) -> {
            System.out.println("Атомный реактор:");
            burning.accept(uran);
        };

        Consumer<Wood> fire = (wood) -> {
            System.out.println("Костер:");
            burning.accept(wood);
        };

        atomicReactor.accept(uranFuel);
        fire.accept(woodFuel);
    }
}

