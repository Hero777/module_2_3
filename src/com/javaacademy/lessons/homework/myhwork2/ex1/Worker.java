package com.javaacademy.lessons.homework.myhwork2.ex1;

import java.util.Queue;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void scream(Queue<Case> cases) {
        if (cases.isEmpty()) {
            return;
        }
        Case someCase = cases.poll();
        System.out.printf("%s: Мужики, кидаю чемодан %s \n", name, someCase.getNumOfFlight());
    }
}

