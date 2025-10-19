package java_practice.javarush.level26.lecture05;

public class Solution2 {
    public static void main(String[] args) {
        // Создаем "универсальный сундук" для строк
        UniversalChest<String> messageChest = new UniversalChest<>();
        messageChest.put("Тайное послание: «Да пребудет с тобой Java!»");

        // Создаем "универсальный сундук" для целых чисел
        UniversalChest<Integer> numberChest = new UniversalChest<>();
        numberChest.put(777); // магическое число

        // Извлекаем содержимое сундуков
        String secretMessage = messageChest.take();
        Integer magicNumber = numberChest.take();

        // Выводим содержимое на экран
        System.out.println(secretMessage);
        System.out.println(magicNumber);
    }
}

// Универсальный сундук: обобщенный класс, способный хранить объект любого типа T
class UniversalChest<T> {
    // Приватное поле для хранения "сокровища" типа T
    private T item;

    // Метод для помещения предмета в сундук
    public void put(T item) {
        this.item = item;
    }

    // Метод для извлечения предмета из сундука
    // Возвращает предмет и "опустошает" сундук, чтобы подчеркнуть идею извлечения
    public T take() {
        return item;
    }
}