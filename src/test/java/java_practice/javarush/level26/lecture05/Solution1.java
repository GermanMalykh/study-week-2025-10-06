package java_practice.javarush.level26.lecture05;

import java.util.ArrayList;

public class Solution1 {
    public static void main(String[] args) {
        // Создаем дженерик-коллекцию для хранения книг (каталог)
        ArrayList<Book> catalog = new ArrayList<>();

        // Добавляем две разные книги с разными названиями и авторами
        catalog.add(new Book("У Лукоморья", "Пушкин"));
        catalog.add(new Book("Война и мир", "Толстой"));

        // Перебираем каталог и выводим название и автора каждой книги
        for (Book book : catalog) {
            System.out.println(book.getTitle() + " " + book.getAuthor());
        }
    }
}

// Отдельный класс, представляющий книгу: хранит название и автора
class Book {
    private final String title;
    private final String author;

    // Конструктор инициализирует поля книги
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттеры для доступа к полям
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}