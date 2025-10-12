package java_practice.javarush.level23.lecture05;

public class Solution2 {
    int count = 10;
    String message = "Привет";

    void printMessage() {
        System.out.println(message + " " + count);
    }

    public static void main(String[] args) {
        // Создаем объект и вызываем метод для демонстрации результата
        Solution2 app = new Solution2();
        app.printMessage();
    }
}
