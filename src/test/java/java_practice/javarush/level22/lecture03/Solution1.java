package java_practice.javarush.level22.lecture03;

record Book(String title, String author) {
}

public class Solution1 {
    public static void main(String[] args) {
        // Создаем объект книги с произвольными значениями
        Book book = new Book("Чистый код", "Роберт Мартин");

        // Печатаем объект: будет использован автогенерированный toString() записи
        System.out.println(book);
    }
}
