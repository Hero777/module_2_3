package com.javaacademy.lessons.homework.myhwork1;

import com.javaacademy.lessons.homework.myhwork1.ex1.*;
import com.javaacademy.lessons.homework.myhwork1.ex3.Item;
import com.javaacademy.lessons.homework.myhwork1.ex3.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class HomeworkMy {
    public static void main(String[] args) {

        Zoo<Animal> animalZoo = new Zoo<>(new Tiger(), new Dog(), new Bird());
        animalZoo.getSkill(animalZoo.getAnimal1());
        animalZoo.getSkill(animalZoo.getAnimal2());
        animalZoo.getSkill(animalZoo.getAnimal3());

        System.out.println("---------------next task-------------------");
        List<Integer> list1 = List.of(5, 2, 4);
        List<Integer> list2 = List.of(7, 10);
        List<Integer> finalList = new ArrayList<>(list1);
        finalList.addAll(list2);
        finalList.remove(3);
        System.out.println("Индекс числа 10: " + finalList.indexOf(10));
        System.out.println("---------------next task-------------------");
        Item computer = new Item("компьютер");
        Item table = new Item("стол");
        Item pen = new Item("ручка");
        Item pencil = new Item("карандаш");
        Item ball = new Item("мяч");
        Warehouse warehouse = new Warehouse();
        warehouse.addItem(computer);
        warehouse.addItem(table);
        warehouse.addItem(pen);
        warehouse.addItem(pencil);
        warehouse.addItem(ball);
        System.out.println(warehouse);
        List<Item> anotherItems = List.of(new Item("Штаны"), new Item("Футболка"));
        warehouse.addItems(anotherItems);
        System.out.println(warehouse);
        System.out.println(warehouse.getEvenListOfItems());
        System.out.println(warehouse.getItemByIndex(0));
        warehouse.removeAllItemsExceptLast();
        System.out.println(warehouse);
    }
}
