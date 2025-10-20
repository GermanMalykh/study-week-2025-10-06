package java_practice.javarush.level27.lecture02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        // Создаем множество HashSet<String> для хранения технологий
        Set<String> language = new HashSet<>();

        // Добавляем названия технологий
        language.add("java");
        language.add("python");
        language.add("c++");
        language.add("javascript");

        // Удаляем элементы, содержащие символ '+', используя итератор
        Iterator<String> it = language.iterator();
        while (it.hasNext()) {
            String value = it.next();
            if (value.contains("+")) {
                it.remove();
            }
        }

        // Выводим оставшиеся элементы множества, каждый на новой строке (порядок не гарантируется)
        for (String lang : language) {
            System.out.println(lang);
        }
    }
}
