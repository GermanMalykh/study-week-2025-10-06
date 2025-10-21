package java_practice.javarush.level28.lecture03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        // Создаем и заполняем HashMap результатами участников
        HashMap<String, Integer> results = new HashMap<>();
        results.put("A", 1);
        results.put("B", 2);
        results.put("C", 3);
        results.put("D", 4);

        // Получаем итератор по набору записей (entrySet)
        Iterator<Map.Entry<String, Integer>> it = results.entrySet().iterator();

        // Идем по каждой паре "участник-балл"
        while (it.hasNext()) {
            Map.Entry<String, Integer> score = it.next();
            if (score.getValue() % 2 == 0) {
                it.remove();
            }
        }

        // Выводим очищенную карту на экран
        System.out.println(results);
    }
}
