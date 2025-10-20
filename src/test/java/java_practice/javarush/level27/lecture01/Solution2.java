package java_practice.javarush.level27.lecture01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        // List хранит все предметы, включая повторы
        List<Integer> items = new ArrayList<>();

        // Set хранит только уникальные предметы (повторы игнорируются)
        Set<Integer> uniqItems = new HashSet<>(items);

        // Добавляем идентификаторы 3, 7, 3, 9 в обе коллекции
        items.add(3);
        uniqItems.add(3);
        items.add(7);
        uniqItems.add(7);
        items.add(3);
        uniqItems.add(3);
        items.add(9);
        uniqItems.add(9);

        // Выводим количество: сначала общее (List), затем уникальное (Set)
        System.out.println(items.size());
        System.out.println(uniqItems.size());
    }
}
