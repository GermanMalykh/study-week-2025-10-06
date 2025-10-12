package java_practice.javarush.level23.lecture01;

public class Solution3 {


}


class Calculator {
    // Простой калькулятор: храним последний результат
    private int lastResult;

    // Публичный метод calculate() — точка выполнения вычислений
    public void calculate() {
        int a = 10;
        int b = 5;

        // Пример вычислений
        lastResult = a * b + (a - b);

        // код не скомпилируется, т.к. методы объявляются только внутри класса.


    }

    // Метод объявлен на уровне класса (как и должно быть), а не внутри calculate()
    public void printResult() {

    }

    ; // выносим печать результата в отдельный метод уровня класса

    // Небольшая демонстрация работы
    public static void main(String[] args) {
        new Calculator().calculate();
    }
}