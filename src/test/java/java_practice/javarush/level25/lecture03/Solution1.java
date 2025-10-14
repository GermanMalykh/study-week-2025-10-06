package java_practice.javarush.level25.lecture03;

public class Solution1 {
    public static void main(String[] args) {
        Shape shape; // Переменная базового типа (полиморфизм)

        // Один и тот же тип ссылки указывает на разные объекты и вызывает "свою" реализацию
        shape = new Square(5); // квадрат со стороной 5
        System.out.println("Площадь квадрата: " + shape.calculateSurface());

        shape = new Circle(3); // круг с радиусом 3
        System.out.println("Площадь круга: " + shape.calculateSurface());
    }
}

abstract class Shape {
    abstract double calculateSurface();
}

class Square extends Shape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculateSurface() {
        return sideLength * sideLength;
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateSurface() {
        return 3.14 * radius * radius;
    }
}