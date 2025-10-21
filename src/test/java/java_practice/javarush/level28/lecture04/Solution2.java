package java_practice.javarush.level28.lecture04;

import java.util.EnumMap;

// Перечисление дней недели
enum Day2 {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class Solution2 {
    public static void main(String[] args) {
        // Специализированная карта для enum-ключей: работает быстро и экономит память
        EnumMap<Day2, Integer> ticketPrice = new EnumMap<>(Day2.class);

        // Заполняем цены согласно условию
        ticketPrice.put(Day2.MON, 100);
        ticketPrice.put(Day2.TUE, 120);
        ticketPrice.put(Day2.SAT, 200);

        // Получаем цену на субботу и выводим на экран
        System.out.println(ticketPrice.get(Day2.SAT));
    }
}
