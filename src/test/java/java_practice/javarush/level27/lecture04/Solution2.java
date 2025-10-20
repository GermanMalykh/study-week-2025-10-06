package java_practice.javarush.level27.lecture04;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Solution2 {
    public static void main(String[] args) {
        // Основной складской реестр: упорядоченное множество с навигационными методами
        NavigableSet<Integer> set = new TreeSet<>();

        // Добавляем идентификаторы товаров
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // Формируем "вид" на часть реестра: от 20 (включительно) до 50 (исключительно)
        // subSet в NavigableSet возвращает представление (view), связанное с исходным множеством
        NavigableSet<Integer> sub = set.subSet(20, true, 50, false);

        // Удаляем поврежденный товар 30 из временного списка — изменение отразится и в реестре
        sub.remove(30);

        // Сначала выводим временный список отгрузки, затем основной реестр
        System.out.println(sub);
        System.out.println(set);
    }
}
