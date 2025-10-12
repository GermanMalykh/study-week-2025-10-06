package java_practice.javarush.level23.lecture02;

public class Solution4 {
    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        long value = 5L; // Явно используем тип long

        // Здесь Java выберет перегрузку print(double),
        demo.print(value); // Ожидаемый вывод: "double: 5.0"
    }
}

class OverloadDemo {
    public void print(int valueToPrint) {
        System.out.println("int: " + valueToPrint);
    }

    public void print(double valueToPrint) {
        System.out.println("double: " + valueToPrint);
    }
}
