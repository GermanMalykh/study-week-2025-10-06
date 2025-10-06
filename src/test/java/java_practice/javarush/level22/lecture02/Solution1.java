package java_practice.javarush.level22.lecture02;

record Book(String title, String author) {
}

public class Solution1 {
    public static void main(String[] args) {
        // Создаём экземпляр записи для любимой книги
        Book favoriteBook = new Book("Effective Java", "Joshua Bloch");

        // Выводим всю информацию о книге: название и автора
        System.out.println("Название: " + favoriteBook.title());
        System.out.println("Автор: " + favoriteBook.author());
    }

}
