package java_practice.javarush.level25.lecture02;

public class Solution1 {
    public static void main(String[] args) {
        // Вызываем статический метод вложенного класса по полному имени,
        // не создавая объект внешнего класса Library
        Library.Archive.readParchment();
    }
}

class Library {
    protected static class Archive {
        protected static void readParchment() {
            System.out.println("Древний свиток разгадан!");
        }
    }
}