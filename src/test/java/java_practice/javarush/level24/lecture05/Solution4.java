package java_practice.javarush.level24.lecture05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution4 {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("ancient_manuscript.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("digital_archive.txt"));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка копирования рукописи!");
        }
    }
}
