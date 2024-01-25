package com.javaacademy.lessons.homework.myhwork2.ex1;

import java.util.LinkedList;
import java.util.Queue;

public class BaggageCompartment {
    private Queue<Case> caseQueue = new LinkedList<>();
    private Worker firstWorker;
    private Worker secondWorker;
    private Worker thirdWorker;
    private int CASES_PER_FLIGHT = 20;

    public BaggageCompartment(Worker firstWorker, Worker secondWorker, Worker thirdWorker) {
        this.firstWorker = firstWorker;
        this.secondWorker = secondWorker;
        this.thirdWorker = thirdWorker;
    }

    public void planeArrive(String numOfFlight) {
        for (int i = 0; i < CASES_PER_FLIGHT; i++) {
            this.caseQueue.add(new Case(numOfFlight));
        }
    }

    public void unloadBaggageCompartment() {
        Worker[] workers = {firstWorker, secondWorker, thirdWorker};
        while (!caseQueue.isEmpty()) {
            for (Worker worker : workers) {
                worker.scream(caseQueue);
            }
        }
    }
}
