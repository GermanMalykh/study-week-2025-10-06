package java_practice.javarush.level23.lecture03;

public class Solution4 {
}

class Animal {
    // Защищённый метод: доступен внутри класса, его наследникам и классам в том же пакете
    protected void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {

    public Dog () {
        makeSound();
    }
}

class Cat {
//    public Cat() {
//        animal.makeSound();
//    }
}
