package com.javaacademy.lessons.homework.myhwork1.ex3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private final List<Item> listOfItems = new ArrayList<>();

    public void addItem(Item item) {
        listOfItems.add(item);
    }

    public void addItems(List<Item> listItems) {
        this.listOfItems.addAll(listItems);
    }

    public List<Item> getEvenListOfItems() {
        List<Item> result = new ArrayList<>();
        for (int i = 0; i < listOfItems.size(); i += 2) {
            result.add(listOfItems.get(i));
        }
        return result;
    }

    public Item getItemByIndex(int index) {
        Item item = listOfItems.get(index);
        listOfItems.remove(index);
        return item;
    }

    public void removeAllItemsExceptLast() {
        //сохраняем последний элемент листа
        Item lastItem = listOfItems.get(listOfItems.size() - 1);
        listOfItems.clear();
        listOfItems.add(lastItem);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "listOfItems=" + listOfItems +
                '}';
    }
}
