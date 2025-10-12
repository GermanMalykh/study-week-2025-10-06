package java_practice.javarush.level24.lecture02;

public class Solution4 {
    // Метод пытается "добавить" value предметов при лимите limit
    // Если value > limit — бросаем наше пользовательское исключение с деталями
    public static void tryAddItem(int value, int limit) throws StorageCapacityExceededException {

        // Формируем понятное сообщение и передаем вместе с деталями
        if (value > limit) {
            throw new StorageCapacityExceededException("Превышен лимит склада!", value, limit);
        }

        // Если всё в порядке — просто сообщаем об успехе
        System.out.println("Операция успешна!");
    }

    public static void main(String[] args) {
        try {
            // Симулируем попытку добавить 150 при лимите 100
            tryAddItem(150, 100);
        } catch (StorageCapacityExceededException e) {
            // Перехватываем и выводим сообщение об ошибке и точные детали
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Текущее значение: " + e.getCurrentItemCount());
            System.out.println("Лимит: " + e.getMaximumCapacity());
        }
    }
}


class StorageCapacityExceededException extends Exception {
    private int currentItemCount;
    private int maximumCapacity;

    public StorageCapacityExceededException(String message, int currentItemCount, int maximumCapacity) {
        super(message);
        this.currentItemCount = currentItemCount;
        this.maximumCapacity = maximumCapacity;

    }

    public int getCurrentItemCount() {
        return currentItemCount;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }
}