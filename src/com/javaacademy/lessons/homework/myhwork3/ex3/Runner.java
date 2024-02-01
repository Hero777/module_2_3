package com.javaacademy.lessons.homework.myhwork3.ex3;

import java.util.function.Function;

public class Runner {
    public static void main(String[] args) {


        Function<String, String> chamomile = name -> name.length() % 2 == 0 ? "да" : "нет";
        Function<Human, String> fortuneTeller = human -> (human.getAge() + human.getHeight()) > 210 ? "да" : "нет";

        String ura = chamomile.apply("Юра");
        String valya = chamomile.apply("Валя");

        System.out.println("Ромашка для Юры " + ura);
        System.out.println("Ромашка для Вали " + valya);

        Human h1 = new Human(50, 185);
        Human h2 = new Human(12, 140);

        String human1 = fortuneTeller.apply(h1);
        String human2 = fortuneTeller.apply(h2);

        System.out.println("Бабка-гадалка для 1го человека "+human1);
        System.out.println("Бабка-гадалка для 2го человека "+human2);
    }
}
