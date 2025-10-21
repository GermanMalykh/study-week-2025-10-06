package java_practice.javarush.level28.lecture04;


import java.util.EnumSet;

public class Solution1 {
    public static void main(String[] args) {
        // Создаем EnumSet — специальную коллекцию для enum-ов
        // Сразу инициализируем только выходными днями: суббота и воскресенье
        EnumSet<Day> weekendDays = EnumSet.of(Day.SAT, Day.SUN);

        // Выводим содержимое EnumSet на экран
        System.out.println(weekendDays);
    }
}

// Перечисление с полным набором дней недели
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}
