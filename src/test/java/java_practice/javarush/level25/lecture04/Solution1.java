package java_practice.javarush.level25.lecture04;

public class Solution1 {
    // Универсальная «взлётная полоса»: принимает любой объект, который умеет летать
    public static void launchIntoSky(CanFly flyingObject) {
        // Полиморфный вызов: конкретный soar() определяется у переданного объекта
        flyingObject.soar();
    }

    public static void main(String[] args) {
        // Создаём летающие объекты разных типов
        Aircraft aircraft = new Aircraft();
        Eagle eagle = new Eagle();

        // Запускаем их в небо через универсальную взлётную полосу
        launchIntoSky(aircraft);
        launchIntoSky(eagle);
    }
}

interface CanFly {
    void soar();
}

class Aircraft implements CanFly {
    @Override
    public void soar() {
        System.out.println("Самолёт взлетает!");
    }
}

class Eagle implements CanFly {
    @Override
    public void soar() {
        System.out.println("Орёл парит!");
    }
}