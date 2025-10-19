package java_practice.javarush.level26.lecture04;

import java.util.TreeSet;

public class Solution1 {
    public static void main(String[] args) {
        // TreeSet автоматически сортирует строки по алфавиту и не допускает дубликатов
        TreeSet<String> name = new TreeSet<>();

        // Добавляем первых трёх зарегистрировавшихся (порядок добавления произвольный)
        name.add("Борис");
        name.add("Алексей");
        name.add("Виктор");

        // Выводим список участников в алфавитном порядке
        System.out.println(name);
    }
}
