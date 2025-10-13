package java_practice.javarush.level24.lecture04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution2 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("game_config.txt"));
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            System.out.println("Число: " + number);
            reader.close();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
