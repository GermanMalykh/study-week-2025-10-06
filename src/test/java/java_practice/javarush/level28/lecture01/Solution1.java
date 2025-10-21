package java_practice.javarush.level28.lecture01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        // Создаем изменяемый список с начальными значениями
        List<Integer> points = new ArrayList<>(Arrays.asList(5, -3, 8, -1, 0, 4, -7));

        // Обходим список с помощью Iterator, чтобы безопасно удалять элементы во время обхода
        Iterator<Integer> it = points.iterator();

        // Выводим обновленный список без отрицательных чисел
        while (it.hasNext()) {
            Integer n = it.next();
            if (n < 0) {
                it.remove();
            }
        }
        System.out.println(points);
    }
}
