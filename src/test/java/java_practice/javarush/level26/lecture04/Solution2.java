package java_practice.javarush.level26.lecture04;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        // Исходный список с повторами
        List<String> fruits = Arrays.asList("яблоко", "груша", "яблоко", "слива", "груша");

        // Используем Set для удаления дубликатов.
        LinkedHashSet<String> uniqFruits = new LinkedHashSet<>(fruits);

        // Выводим итоговый набор уникальных товаров
        System.out.println(uniqFruits);
    }
}
