package java_practice.javarush.level25.lecture01;

public class Solution1 {
    public static void main(String[] args) {
        // Создаем кота и просим его поздороваться
        Cat cat = new Cat();
        cat.sayHello(); // Должно вывести "Мяу!"
    }
}

class Animal {
    protected void sayHello() {
        System.out.println("Привет!");
    }
}

class Cat extends Animal {
    @Override
    protected void sayHello() {
        System.out.println("Мяу!");
    }
}