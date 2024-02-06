package com.javaacademy.lessons.homework.myhwork4.ex3;

import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //Задание №3 - Небоскребы, небоскребы, а я...
        //Дано: Небоскреб - имя небоскреба, его высота в метрах.
        //Необходимо создать небоскребы:
        //1 Всемирный торговый центр 1 - 541м
        //2 Шанхайская башня - 632м
        //3	Бурдж-Халифа - 828м
        //4 Международный финансовый центр Пинань - 599м
        //5 Абрадж аль-Бейт - 601м
        //6 Всемирный центр Лотте - 555м

        //Занести данный список в List! Дважды положить бурдж халифа в лист.
        //С помощью стримов:
        //Убрать дубликаты
        //(РАЗНЫЕ СТРИМЫ)
        //Вывести только первые три небоскреба.
        //Вывести самый высокий небоскреб.
        //Вывести те небоскребы, которые выше километра.
        //Если выше нет, то вывести на экран: небоскреба выше километра - нет.
        List<Tower> towerList = List.of(
                new Tower("Всемирный торговый центр 1", 541),
                new Tower("Шанхайская башня", 632),
                new Tower("Бурдж-Халифа", 828),
                new Tower("Международный финансовый центр Пинань", 599),
                new Tower("Абрадж аль-Бейт", 601),
                new Tower("Всемирный центр Лотте", 555),
                new Tower("Бурдж-Халифа", 828)
        );
        System.out.println("Создали список с дубликатом");
        System.out.println("Убираем дубликаты");
        towerList.stream()
                .distinct()
                .toList()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Выводим первые 3 небоскреба");
        towerList.stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Самый высокий небоскреб");
        towerList.stream()
                .max(Comparator.comparing(Tower::getHeight))
                .ifPresent(System.out::println);
        System.out.println();

        System.out.println("Небоскребы выше 1000м");
        towerList.stream().filter(tower -> tower.getHeight() > 1000)
                .map(Tower::getName)
                .reduce((towerName1, towerName2) -> towerName1 + ", " + towerName2)
                .orElseThrow(() -> new RuntimeException("небоскреба выше километра - нет"));
    }
}
