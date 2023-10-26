package ru.geekbrains.lesson4.homework;

public class Program {

    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        appleBox.addFruit(new Apple());

        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());

        Box<Orange> anotherOrangeBox = new Box<>();
        System.out.println("Сравнение коробки с апельсинами и пустой коробкой: " + orangeBox.compare(anotherOrangeBox));

        orangeBox.transferFruitsTo(anotherOrangeBox);
        System.out.println("Вес первой коробки после пересыпания: " + orangeBox.getWeight());
        System.out.println("Вес второй коробки после пересыпания: " + anotherOrangeBox.getWeight());

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());

        Box<Apple> anotherAppleBox = new Box<>();
        System.out.println("Сравнение коробки с яблоками и пустой коробкой: " + appleBox.compare(anotherAppleBox));

        appleBox.transferFruitsTo(anotherAppleBox);
        System.out.println("Вес первой коробки после пересыпания: " + appleBox.getWeight());
        System.out.println("Вес второй коробки после пересыпания: " + anotherAppleBox.getWeight());
    }
}
