package java_practice.javarush.level26.lecture03;

import java.util.Map;
import java.util.TreeMap;

public class Solution1 {
    public static void main(String[] args) {
        // Создаём Map: ключ — название дня недели (String), значение — его номер (Integer)
        TreeMap<String, Integer> weekDays = new TreeMap<>();

        // Добавляем элементы согласно условию задачи
        weekDays.put("Monday", 1);
        weekDays.put("Tuesday", 2);
        weekDays.put("Wednesday", 3);

        // Проходим по всем парам ключ-значение и выводим в требуемом формате
        for (Map.Entry<String, Integer> entry : weekDays.entrySet()) {
            System.out.println("День: " + entry.getKey() + ", Номер: " + entry.getValue());
        }
    }
}
