package com.javaacademy.lessons.homework.myhwork3.ex5;

import java.util.function.Function;

public class Runner {
    public static void main(String[] args) {
        Boat boat = new Boat(350);
        Animal cat = new Animal(50, 30);

        Function<Object, Integer> ruler = (object) -> {
            if (object instanceof Boat) {
                return ((Boat) object).getLength();
            } else if (object instanceof Animal animal) {
                return animal.getBodyLength() + animal.getTailLength();
            }
            return null;
        };

        Function<Boat, Integer> boatMeasurer = (length) -> {
            System.out.println("Измеритель лодок:");
            return ruler.apply(length);
        };
        System.out.println("Длина лодки: " + boatMeasurer.apply(boat));

        Function<Animal, Integer> animalMeasurer = (animal) -> {
            System.out.println("Измеритель животных:");
            return ruler.apply(animal);
        };
        System.out.println("Длина тела и хвоста кота: " + animalMeasurer.apply(cat));
    }
}
