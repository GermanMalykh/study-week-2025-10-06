package java_practice.javarush.level22.lecture05;

record Book(String title, String author) {

}

public class Solution1 {
    public static void main(String[] args) {
        // Создаем экземпляр record-класса для любимой книги
        Book favorite = new Book("Мастер и Маргарита", "Михаил Булгаков");

        // Выводим информацию о книге.
        // Доступ к данным осуществляется через автоматически сгенерированные методы-доступники title() и author().
        System.out.println("Книга: " + favorite.title());
        System.out.println("Автор: " + favorite.author());

        // Дополнительно: record имеет автогенерируемый toString()
        // System.out.println(favorite); // Пример: Book[title=..., author=...]
    }
}
