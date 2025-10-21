package java_practice.javarush.level28.lecture01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        // Создаем изменяемый список с исходными названиями животных
        List<String> animals = new ArrayList<>(Arrays.asList("cat", "elephant", "dog", "tiger", "rat", "lion"));

        // Удаляем все строки, длина которых меньше 4 символов
        // removeIf принимает условие (Predicate): если возвращает true — элемент удаляется
        animals.removeIf(n -> n.length() < 4);

        // Выводим обновленный список после фильтрации
        System.out.println(animals);
    }
}
