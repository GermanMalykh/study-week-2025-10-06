package java_practice.javarush.level24.lecture03;

import java.io.IOException;

public class Solution2 {
    // Этап 1: имитация сбоя при подготовке исходных данных
    public static void prepareSourceData() throws IOException {
        // Специально "падаем" с IOException с нужным сообщением
        throw new IOException("Исходный файл не найден");
    }

    // Этап 2: загрузка/обработка сырых данных
    public static void processRawData() throws DataLoadingError {
        try {
            prepareSourceData();
        } catch (IOException e) {
            throw new DataLoadingError("Ошибка загрузки данных", e);
        }
    }

    // Этап 3: генерация итогового отчёта
    public static void generateFinalReport() throws DataLoadingError {
        try {
            processRawData();
        } catch (DataLoadingError e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            generateFinalReport();
        } catch (DataLoadingError e) {
            // Выводим сообщение нашего исключения
            System.out.println(e.getMessage());

            // И сообщение первопричины (IOException)
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println(cause.getMessage());
            }
        }
    }
}

class DataLoadingError extends Exception {
    public DataLoadingError(String message) {
        super(message);
    }

    public DataLoadingError(String message, Throwable cause) {
        super(message, cause);
    }
}