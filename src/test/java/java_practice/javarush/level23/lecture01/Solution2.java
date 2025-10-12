package java_practice.javarush.level23.lecture01;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(Book.libraryBook.getTitle());
    }
}

class Book {
    private final String title;

    static Book libraryBook = null;

    public Book(String title) {
        this.title = title;
    }

    // Метод, который мы будем пытаться вызвать у null-ссылки
    public String getTitle() {
        return title;
    }
}
