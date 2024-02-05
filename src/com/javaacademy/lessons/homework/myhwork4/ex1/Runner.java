package com.javaacademy.lessons.homework.myhwork4.ex1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    //Задание №1 - Список спец номеров
    //Создать класс машина. У машины есть номер.
    //Создать 50 машин с номерами а0[01-50]ан799 (где [01-50] - это все значения от 01 до 50)
    //Создать 50 машин с номерами к0[01-50]се178
    //Соединить машины в единый стрим
    //Машины, с номерами 04[0-9] - это спец номера (врачи)
    //оставить только те машины, которые обладают спец номерами
    //Получить из машин номера
    //Соединить в единую строку, с разделителем в " ," - самостоятельное изучение
    //ожидаемый финал
    //"a040ан1799, a041ан799, ... , k048се178, k049се178"
    public static void main(String[] args) {
        String template1 = "а%03dан799";
        String template2 = "к%03dсе178";
        Stream<Car> cars1 = getCarStream(template1);
        Stream<Car> cars2 = getCarStream(template2);

        String doctorsCars = Stream.concat(cars1, cars2)
                .filter(car -> Integer.parseInt(car.getNumber().substring(1, 4)) >= 40
                        && Integer.parseInt(car.getNumber().substring(1, 4)) < 50)
                .map(Car::getNumber)
                .collect(Collectors.joining(", "));

        System.out.println(doctorsCars);
    }

    private static Stream<Car> getCarStream(String template) {
        AtomicInteger counter = new AtomicInteger();
        return Stream.generate(() -> new Car(
                        String.format(template, counter.addAndGet(1))))
                .limit(50);
    }
}
