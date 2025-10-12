package java_practice.javarush.level24.lecture01;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution4 {
    public static void main(String[] args) {
        try {
            // Имитация поиска отчёта: намеренно бросаем исключение
            throw new FileNotFoundException("Отчёт не найден!");
        }
        catch (FileNotFoundException e) {
            // Самый специфичный план: файл отсутствует
            System.out.println("План 1 (файл отсутствует): " + e.getMessage());
        }
        catch (IOException e) {
            // Более общий план: проблемы ввода-вывода
            System.out.println("План 2 (IO): Произошла ошибка ввода-вывода");
        }
        catch (Exception e) {
            // Самый общий план: любая другая непредвиденная ситуация
            System.out.println("План 3 (Unexpected): Произошла непредвиденная ошибка");
        }
    }
}
