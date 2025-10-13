package java_practice.javarush.level24.lecture04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution3 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("game_config.txt"));
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            System.out.println("Число: " + number);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Секретный документ не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка доступа к архиву!");
        }

        // Пытаемся открыть файл — здесь может возникнуть FileNotFoundException
        // Лёгкая проверка доступа: читаем первый байт (может вернуть -1, если файл пуст)
        // Намеренно провоцируем более общую ошибку ввода-вывода
        // Важно: этот catch идёт ПЕРЕД IOException, иначе код не скомпилируется
        // Обработка всех прочих ошибок ввода-вывода

    }
}
