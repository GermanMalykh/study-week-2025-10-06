package java_practice.javarush.level26.lecture02;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        // Создаем динамический список (ArrayList) для названий фильмов
        List<String> films = new ArrayList<>();

        // Добавляем фильмы в список
        films.add("Титаник");
        films.add("Матрица");
        films.add("Интерстеллар");

        // по ошибке добавили снова
        films.add("Матрица");
        // Ищем первое вхождение "Матрица"
        System.out.println(films.indexOf("Матрица") + 1);

        // Проверяем наличие "Аватар" в списке
        // contains возвращает true/false
        System.out.println(films.contains("Аватар"));

        // Очищаем список
        films.clear();

        // Выводим содержимое списка после очистки — должен быть пустым: []
        System.out.println(films);
    }
}
