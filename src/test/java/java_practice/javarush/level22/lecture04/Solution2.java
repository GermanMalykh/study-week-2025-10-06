package java_practice.javarush.level22.lecture04;

record Email(String address) {
    Email {
        if (address == null || address.isBlank())
            throw new IllegalArgumentException("Email не должен быть пустым");
        if (!address.contains("@"))
            throw new IllegalArgumentException("Email должен содержать \"@\"");
    }
}

public class Solution2 {
    public static void main(String[] args) {
        // 1) Корректный email — создаем и выводим
        Email good = new Email("student@example.com");
        System.out.println("Создан корректный адрес: " + good.address());

        // 2) Некорректный email — без символа '@'
        // Эта строка выбросит IllegalArgumentException с сообщением из конструктора и завершит программу
        Email bad = new Email("student.example.com");

        // До этой строки выполнение не дойдет
        System.out.println(bad.address());
    }
}
