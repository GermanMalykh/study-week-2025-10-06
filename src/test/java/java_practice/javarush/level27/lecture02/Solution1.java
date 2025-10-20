package java_practice.javarush.level27.lecture02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        // Создаём словарь переводов: английское слово -> русский перевод
        Map<String, String> vocabulary = new HashMap<>();

        // Заполняем словарь тремя парами
        vocabulary.put("dog", "собака");
        vocabulary.put("cat", "кошка");
        vocabulary.put("bird", "птица");

        // Перебираем пары через for-each по entrySet()
        // (под капотом используется Iterator, что и требуется по условию)
        Iterator<Map.Entry<String, String>> it = vocabulary.entrySet().iterator();
        // Форматированный вывод в виде "ключ = значение"
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
