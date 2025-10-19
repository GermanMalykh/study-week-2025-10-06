package java_practice.javarush.level26.lecture02;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        // Используем интерфейс List для хранения названий предметов
        List<String> subjects = new ArrayList<>();

        // Добавляем три основных предмета
        subjects.add("Математика");
        subjects.add("Физика");
        subjects.add("Информатика");

        // Вставляем "Английский" на первую позицию списка
        subjects.add(0, "Английский");

        // Удаляем предмет "Физика" из расписания
        subjects.remove("Физика");

        // Выводим итоговое расписание: каждый предмет с новой строки
        subjects.forEach(subject -> System.out.println(subject));
    }
}
