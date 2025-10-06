package java_practice.javarush.level22.lecture04;

record Temperature(double temp) {

    public static Temperature fromFahrenheit(double fahrenheit) {
        return new Temperature((fahrenheit - 32) * 5 / 9);
    }

    public double celsius() {
        return temp;
    }

}

public class Solution1 {
    public static void main(String[] args) {
        // Создаем объект температуры по значению в Фаренгейтах (212°F — кипение воды)
        Temperature boiling = Temperature.fromFahrenheit(212);

        // Выводим значение в градусах Цельсия
        System.out.println(boiling.celsius());
    }
}

