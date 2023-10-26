package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }
        return fruits.size() * fruits.get(0).getWeight();
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transferFruitsTo(Box<T> otherBox) {
        if (this == otherBox) {
            return;
        }
        otherBox.fruits.addAll(fruits);
        fruits.clear();
    }
}
