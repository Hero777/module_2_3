package com.javaacademy.lessons.homework.myhwork4.ex2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //Задание №2 - Сколько здесь "о" ?
        //Создать набор уникальных слов: "тонь", "тополь", "боль", "рой", "стройка"
        //Внутри одного стрима:
        //Посчитать количество букв "о" в одном слове
        //Посчитать сумму количества букв "о" во всех словах из набора
        //Если буквы "о" есть - напечатать количество букв "о", если нет выкинуть исключение
        //ожидаемый результат:
        // 6
        List<String> words = List.of("тонь", "тополь", "боль", "рой", "стройка");

        Integer sumOfOLetters = words.stream()
                .mapToInt(word -> (int)word.chars().filter(ch -> ch == 'о').count())
                .reduce(0, Integer::sum);

        words.stream()
                .filter(word -> sumOfOLetters > 0)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Буква 'о' не найдена"));

        System.out.println(sumOfOLetters);
    }
}

