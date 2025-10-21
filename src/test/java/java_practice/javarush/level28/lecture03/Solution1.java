package java_practice.javarush.level28.lecture03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Solution1 {
    public static void main(String[] args) {
        // Формируем исходный список животных
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("fish");

        // Получаем ListIterator для безопасного прохода и модификации списка
        ListIterator<String> iterator = animals.listIterator();

        // Итерируемся по списку
        while (iterator.hasNext()) {
            String animal = iterator.next();
            if (animal.length() == 3) {
                iterator.remove();
                iterator.add("pet");
            }
        }

        // После обработки выводим итоговый список на экран
        System.out.println(animals);
    }
}