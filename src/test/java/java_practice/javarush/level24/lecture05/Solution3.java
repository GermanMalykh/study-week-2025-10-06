package java_practice.javarush.level24.lecture05;

public class Solution3 {
    public static void main(String[] args) {
        try {
            parseMeasurementValue("123abc");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования числа: введены некорректные данные");
        }
    }

    /**
     * Метод преобразования строки в число.
     *
     * @param measurement Строка для преобразования в число
     * @return Преобразованная в число строка
     * @throws NumberFormatException Ошибка, если строка не является числом
     */
    public static int parseMeasurementValue(String measurement) throws NumberFormatException {
        return Integer.parseInt(measurement);
    }
}
