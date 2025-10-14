package java_practice.javarush.level25.lecture02;

public class Solution2 {
    public static void main(String[] args) {
        // Создаем объект интерфейса Pressable "на лету" с помощью анонимного класса
        Pressable pressable = new Pressable() {
            @Override
            public void activateEngine() {
                System.out.println("Двигатели запущены! Мы летим к звёздам!");
            }
        };
        pressable.activateEngine();
        // "Нажимаем" кнопку: вызываем метод активации
    }
}

interface Pressable {
    void activateEngine();
}