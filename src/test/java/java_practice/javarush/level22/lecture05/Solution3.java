package java_practice.javarush.level22.lecture05;

interface Printable {
    void print();
}

record Document(String docName) implements Printable {
    @Override
    public void print() {
        System.out.println("Документ: " + docName);
    }
}

public class Solution3 {
    public static void main(String[] args) {
        // Создаем документ с произвольным текстовым содержимым
        Printable doc = new Document("Привет из record-класса!");

        // Демонстрация работы: печать содержимого документа
        doc.print();
    }
}
