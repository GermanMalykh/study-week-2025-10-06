package java_practice.javarush.level26.lecture01;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        // Создаем динамический список (реализация ArrayList) для хранения названий фруктов
        List<String> fruits = new ArrayList<>();

        // Добавляем фрукты в заданном порядке
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Груша");

        // Выводим весь список: метод toString() у коллекции показывает все элементы
        System.out.println(fruits);
    }
}
