package java_practice.javarush.level23.lecture04;

public class Solution3 {
    public static void main(String[] args) {
        // Полиморфная переменная базового типа "Appliance"
        Appliance homeAppliance = new Kettle();

        // Перед вызовом специфичного метода проверяем реальный тип прибора
        if (homeAppliance instanceof Kettle) {
            // Безопасное приведение типа после instanceof
            Kettle kettle = (Kettle) homeAppliance;
            kettle.boil(); // Выведет: "Вода закипела"
        }
    }
}

abstract class Appliance {
    abstract void turnOn();
}

class Kettle extends Appliance {

    public void boil() {
        System.out.println("Вода закипела");
    }

    @Override
    void turnOn() {
    }
}

class Toaster extends Appliance {

    @Override
    void turnOn() {
    }
}