package java_practice.javarush.level23.lecture02;

public class Solution2 {
    public static void main(String[] args) {
        // Создаем объект собаки
        Dog dog = new Dog();

        // Вызываем унаследованный метод без параметров (не переопределен в Dog)
        dog.makeSound(); // Выведет: Some sound

        // Вызываем перегруженную версию метода с параметром
        dog.makeSound("громко"); // Выведет: Bark! громко
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    public void makeSound(String intensity) {
        System.out.println("Bark! " + intensity);
    }
}