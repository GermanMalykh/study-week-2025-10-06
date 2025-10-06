package java_practice.javarush.level22.lecture04;

record Transaction(String from, String to, double amount) {
    Transaction {
        if (amount <= 0 || from == null || to == null || to.trim().isEmpty() || from.trim().isEmpty())
            throw new IllegalArgumentException("Сумма должна быть больше \"0\"");
    }

    public String describe() {
        return "Перевод " + amount + " от " + from + " к " + to;
    }
}

public class Solution4 {
    public static void main(String[] args) {
        // Создаем корректную транзакцию и выводим её описание
        Transaction ok = new Transaction("Иван Петров", "Мария Смирнова", 12500.75);
        System.out.println(ok.describe());

        // Пробуем создать транзакцию с отрицательной суммой.
        // Исключение намеренно не перехватываем, чтобы программа завершилась с ошибкой,
        // демонстрируя работу валидации.
        Transaction bad = new Transaction("Иван Петров", "Мария Смирнова", -100.0);

        // Этот код не выполнится из-за исключения выше:
        System.out.println(bad.describe());
    }
}
