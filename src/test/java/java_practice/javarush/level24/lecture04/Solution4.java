package java_practice.javarush.level24.lecture04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Solution4 {
    public static void main(String[] args) {
        System.out.println("Фоновая служба логирования запущена.");

        try {
            // Создаём временную директорию и намеренно используем её как путь к "файлу" лога.
            Path logFile = Files.createTempDirectory("logDir");
            // Симулируем запись важного события в лог-файл
            writeLog(logFile, "test");

            // До этой строки выполнение не дойдёт из-за выброшенного выше исключения
            saveEvent("test", logFile);
        } catch (IOException e) {
            // Блок catch не пустой — здесь печатается полный стек вызовов.
           e.printStackTrace();
        }

        System.out.println("Демонстрация завершена.");
    }

    // Бизнес-уровень: сохранение события делегирует фактическую запись.
    private static void saveEvent(String message, Path logFile) throws IOException {
        writeLog(logFile, message);
    }

    // Низкоуровневый метод: попытка записи в указанный путь.
    private static void writeLog(Path logFile, String text) throws IOException {
        // Пытаемся записать строку. В нашей демонстрации logFile указывает на директорию - будет исключение
        Files.writeString(logFile, text + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
