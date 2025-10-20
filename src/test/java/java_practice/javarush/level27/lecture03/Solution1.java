package java_practice.javarush.level27.lecture03;


import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    public static void main(String[] args) {
        // Создаем очередь задач на основе LinkedList
        Queue<Integer> tasks = new LinkedList<>();
        // Добавляем идентификаторы задач в указанном порядке
        tasks.add(5);
        tasks.add(15);
        tasks.add(25);

        // Получаем первый элемент без удаления из очереди (peek не изменяет очередь)
        tasks.peek();

        // Выводим идентификатор следующей задачи
        System.out.println(tasks.peek());

        // Выводим текущий размер очереди
        System.out.println(tasks.size());
    }
}
