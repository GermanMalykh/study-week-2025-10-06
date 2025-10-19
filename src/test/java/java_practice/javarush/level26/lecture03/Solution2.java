package java_practice.javarush.level26.lecture03;

import java.util.Map;
import java.util.TreeMap;

public class Solution2 {
    public static void main(String[] args) {
        // TreeMap автоматически поддерживает сортировку ключей по алфавиту (естественный порядок String)
        TreeMap<String, Integer> fruits = new TreeMap<>();

        // Добавляем данные о фруктах
        fruits.put("pear", 6);
        fruits.put("apple", 2);
        fruits.put("banana", 4);

        // Проходим по записям: порядок уже алфавитный благодаря TreeMap
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            System.out.println("Фрукт: " + entry.getKey() + ", Количество: " + entry.getValue());
        }
    }
}
