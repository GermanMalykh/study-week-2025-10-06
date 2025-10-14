package java_practice.javarush.level25.lecture04;

public class Solution2 {
    public static void main(String[] args) {
        // Простая реализация интерфейса (анонимный класс)
        Renderable shape = new Renderable() {
            @Override
            public void paint() {
                System.out.println("Отрисовка простого объекта (Shape)...");
            }
        };

        // Вызовы методов согласно требованиям
        shape.paint();                         // Абстрактный метод
        shape.adjustScale();                   // Default-метод
        Renderable.validateColorPalette();     // Static-метод интерфейса
    }
}

interface Renderable {

    void paint();

    default void adjustScale() {
        System.out.println("Размер объекта скорректирован по умолчанию.");
    }

    static void validateColorPalette() {
        System.out.println("Цветовая палитра проверена, всё в порядке!");
    }
}