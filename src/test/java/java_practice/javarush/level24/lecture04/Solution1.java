package java_practice.javarush.level24.lecture04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution1 {
    public static void main(String[] args) {
        // try-with-resources автоматически закроет файл даже при ошибках
        try {
            BufferedReader reader = new BufferedReader(new FileReader("daily_transactions.txt"));
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            System.out.println("Число: " + number);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл транзакций не найден!");
        }
        catch (IOException e) {
            System.out.println("Ошибка чтения данных из файла!");
        }
        catch (NumberFormatException e) {
            System.out.println("В файле обнаружены некорректные финансовые данные!");
        }
    }
}
