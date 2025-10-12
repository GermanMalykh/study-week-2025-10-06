package java_practice.javarush.level23.lecture04;

public class Solution2 {
    public static void main(String[] args) {
        // "Холст" для фигур: массив общего типа Shape (демонстрация полиморфизма)
        Shape[] canvas = new Shape[2];

        // Добавляем по одному объекту каждой конкретной фигуры
        canvas[0] = new Circle();
        canvas[1] = new Square();

        // Проходим по массиву и полиморфно вызываем метод printType()
        for (Shape shape : canvas) {
            shape.printType(); // каждая фигура печатает своё имя
        }
    }
}

abstract class Shape {
    abstract void printType();
}

class Circle extends Shape {
    @Override
    void printType() {
        System.out.println("Круг");
    }
}

class Square extends Shape {
    @Override
    void printType() {
        System.out.println("Квадрат");
    }
}
