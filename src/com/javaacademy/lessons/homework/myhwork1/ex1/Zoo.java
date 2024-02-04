package com.javaacademy.lessons.homework.myhwork1.ex1;

public class Zoo<T> {
    private T animal1;
    private T animal2;
    private T animal3;

    public Zoo(T animal1, T animal2, T animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public T getAnimal1() {
        return animal1;
    }

    public T getAnimal2() {
        return animal2;
    }

    public T getAnimal3() {
        return animal3;
    }

    public void getSkill(T animal) {
        if (animal instanceof Tiger) {
            ((Tiger) animal).skill();
        } else if (animal instanceof Dog) {
            ((Dog) animal).skill();
        } else if (animal instanceof Bird) {
            ((Bird) animal).skill();
        }
    }
}


