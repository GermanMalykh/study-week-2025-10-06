package java_practice.javarush.level25.lecture01;

public class Solution2 {
    public static void main(String[] args) {
        // Создаем кота и передаем имя в конструктор Cat
        Cat2 cat = new Cat2("Мурзик");

        // Проверим, что имя успешно инициализировалось через super(...)
        System.out.println(cat.name);
    }
}

class Animal2 {
    protected String name;

    public Animal2(String name) {
        this.name = name;
    }

    protected void sayHello() {
        System.out.println("Привет!");
    }
}

class Cat2 extends Animal2 {

    public Cat2(String name) {
        super(name);
    }

    @Override
    protected void sayHello() {
        System.out.println("Мяу!");
    }
}