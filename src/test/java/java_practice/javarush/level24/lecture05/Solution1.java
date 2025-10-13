package java_practice.javarush.level24.lecture05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution1 {
    public static void main(String[] args) {
        // Используем try-with-resources, чтобы поток автоматически закрылся
        try (BufferedReader fr = new BufferedReader(new FileReader("article_text.txt"))) {
            String line = fr.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Ошибка чтения статьи!");
        }
    }
}


class Example {
    /**
     * Читает содержимое файла.
     *
     * @param filename имя файла
     * @return содержимое файла в виде строки
     * @throws IOException если произошла ошибка чтения файла
     */
    private String readFile(String filename) throws IOException {
        return "";
    }

    /**
     * Делит a на b.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления
     * @throws IllegalArgumentException если b == 0
     */
    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Делитель не может быть нулём");
        return a / b;
    }
}
