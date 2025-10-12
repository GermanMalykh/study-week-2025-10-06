package java_practice.javarush.level24.lecture01;

import java.io.FileNotFoundException;

public class Solution3 {
    public static void main(String[] args) {
        // "Неожиданный сбой": RuntimeException — непроверяемое (unchecked) исключение
        RuntimeException unexpectedGlitch = new RuntimeException();

        // "Потерянный файл конфигурации": FileNotFoundException — проверяемое (checked) исключение
        FileNotFoundException missingConfigurationFile = new FileNotFoundException();

        // Выводим классификацию исключений
        System.out.println("RuntimeException — unchecked");
        System.out.println("FileNotFoundException — checked");
    }
}
