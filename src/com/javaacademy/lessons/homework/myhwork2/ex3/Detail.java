package com.javaacademy.lessons.homework.myhwork2.ex3;

public class Detail {
    private String name;

    public Detail(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "name='" + name + '\'' +
                '}';
    }
}
