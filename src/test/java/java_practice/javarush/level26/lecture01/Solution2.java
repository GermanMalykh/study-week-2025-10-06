package java_practice.javarush.level26.lecture01;

import java.util.HashMap;

public class Solution2 {
    public static void main(String[] args) {
        // Создаем "картотеку" студентов: ключ — имя (String), значение — возраст (Integer)
        HashMap<String, Integer> studentCard = new HashMap<>();

        // Добавляем три записи о студентах
        studentCard.put("Иван", 20);
        studentCard.put("Мария", 21);
        studentCard.put("Алексей", 19);

        // Выводим полный список всех студентов и их возрастов
        System.out.println(studentCard);
    }
}
