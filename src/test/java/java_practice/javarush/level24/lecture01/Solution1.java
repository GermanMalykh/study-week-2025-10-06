package java_practice.javarush.level24.lecture01;

import java.io.IOException;

public class Solution1 {
    public static void main(String[] args) {
        // Создаем две "проблемы": сетевую (IOException) и пропажу данных (NullPointerException)
        IOException networkProblem; //throw IOException;
        NullPointerException missingDataError; //NullPointerException
        // Для каждого исключения получаем непосредственный класс-родитель через рефлексию
        networkProblem = new IOException();
        missingDataError = new NullPointerException();

        // Выводим имена родительских классов
        System.out.println(networkProblem.getClass().getSuperclass().getName());
        System.out.println(missingDataError.getClass().getSuperclass().getName());
    }
}
