package java_practice.javarush.level28.lecture05;

import java.util.LinkedHashMap;

public class Solution1 {
    public static void main(String[] args) {
        // Создаем LinkedHashMap с "порядком по обращению" (accessOrder = true).
        LinkedHashMap<String, Integer> example = new LinkedHashMap<>(16, 0.75f, true);

        // Добавляем товары: ключ — код товара, значение — его id
        example.put("a", 1);
        example.put("b", 2);
        example.put("c", 3);

        // Имитация просмотра товара "b": доступ через get переносит "b" в конец
        example.get("b");

        // Выводим ключи в текущем порядке обхода: ожидается a, c, b
        for (String key : example.keySet()) {
            System.out.println(key);
        }
    }
}
