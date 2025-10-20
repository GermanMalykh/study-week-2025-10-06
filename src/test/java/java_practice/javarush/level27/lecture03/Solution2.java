package java_practice.javarush.level27.lecture03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Solution2 {
    public static void main(String[] args) {
        // Очередь печати на базе ArrayDeque (FIFO)
        Queue<String> animals = new ArrayDeque<>();
        animals.add("Кот");
        animals.add("Пёс");
        animals.add("Мышь");

        // Стек истории действий на базе ArrayDeque (LIFO)
        Deque<Character> history = new ArrayDeque<>();

        // Используем push для добавления на вершину стека
        history.push('X');
        history.push('Y');
        history.push('Z');

        // Вывод очереди: сначала заголовок, затем извлекаем (poll) элементы в порядке FIFO
        System.out.println("Очередь:");
        while (!animals.isEmpty()) {
            System.out.println(animals.poll());
        }

        // Вывод стека: сначала заголовок, затем снимаем (pop) элементы в порядке LIFO
        System.out.println("Стек:");
        while (!history.isEmpty()) {
            System.out.println(history.pop());
        }
    }
}
