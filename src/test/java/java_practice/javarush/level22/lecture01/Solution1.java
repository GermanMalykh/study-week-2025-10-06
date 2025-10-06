package java_practice.javarush.level22.lecture01;

record BookCard(String title, String author) {
}

public class Solution1 {
    public static void main(String[] args) {
        // Создаем карточку для любимой книги, заполняя оба поля
        BookCard favorite = new BookCard("Мастер и Маргарита", "Михаил Булгаков");

        // Выводим все детали книги на экран
        System.out.println("Название: " + favorite.title());
        System.out.println("Автор: " + favorite.author());
    }
}
