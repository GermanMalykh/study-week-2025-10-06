package java_practice.javarush.level22.lecture04;

record Person(String name, int age) {
    final static String homo = "Homo sapiens";

    public String greeting() {
        return "Привет, меня зовут " + name + ", мне " + age + " лет. Я — " + homo;
    }
}

public class Solution3 {
    public static void main(String[] args) {
        // Создаем персонажа с именем "Иван" и возрастом 25
        Person ivan = new Person("Иван", 25);

        // Вызываем метод приветствия и выводим результат
        System.out.println(ivan.greeting());
    }
}
