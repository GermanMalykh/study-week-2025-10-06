package java_practice.javarush.level23.lecture02;

public class Solution3 {
}

class Animal1 {
    // Поле для хранения имени животного
    private final String name;

    // Конструктор, принимающий имя животного
    // В классе нет конструктора без параметров, чтобы нельзя было создать животное без имени
    public Animal1(String petName) {
        this.name = petName;
    }

    // Геттер для получения имени животного
    public String getName() {
        return name;
    }
}

class Cat extends Animal1 {

    public Cat(String petName) {
        super(petName);
    }
}
