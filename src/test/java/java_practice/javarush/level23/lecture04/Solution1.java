package java_practice.javarush.level23.lecture04;

public class Solution1 {
    public static void main(String[] args) {
        // Создаём собаку и "нажимаем" на её кнопку звука
        Dog dog = new Dog();
        dog.makeSound();
    }
}

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Гав!");
    }
}