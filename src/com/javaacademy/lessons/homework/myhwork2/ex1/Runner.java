package com.javaacademy.lessons.homework.myhwork2.ex1;

public class Runner {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom");
        Worker don = new Worker("Don");
        Worker bob = new Worker("Bob");

        BaggageCompartment bc = new BaggageCompartment(tom, don, bob);

        bc.planeArrive("SU-077");
        bc.planeArrive("AO-222");

        bc.unloadBaggageCompartment();
    }
}
