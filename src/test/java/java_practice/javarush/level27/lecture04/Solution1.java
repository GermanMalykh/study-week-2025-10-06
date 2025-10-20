package java_practice.javarush.level27.lecture04;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Solution1 {
    public static void main(String[] args) {
        // Создаем NavigableMap, чтобы быстро находить порог по баллам
        NavigableMap<Integer, String> grades = new TreeMap<>();

        // Заполняем карту: ключ — минимальные баллы, значение — название уровня
        grades.put(1, "бронзовый");
        grades.put(3, "серебряный");
        grades.put(5, "золотой");
        grades.put(7, "платиновый");

        // Считываем количество баллов клиента
        int score = 4;

        // Находим наибольший ключ, не превышающий количество баллов
        int key = grades.floorKey(score); // 75

        // Получаем и выводим название уровня (если порога нет — выводим сообщение)
        System.out.println(grades.get(key));
    }
}
