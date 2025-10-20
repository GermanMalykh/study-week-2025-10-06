package java_practice.javarush.level27.lecture01;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        // Объявляем переменную палитры через интерфейс List,
        // а в качестве реализации используем LinkedList
        List<String> colors = new LinkedList<>();

        // Добавляем три цвета в палитру
        colors.add("красный");
        colors.add("зелёный");
        colors.add("синий");

        // Получаем второй элемент (индекс 1) методом get и выводим его
        System.out.println(colors.get(1));
    }
}
