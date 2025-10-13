package java_practice.javarush.level24.lecture03;

public class Solution4 {
    // Инициирует первый сбой без первопричины (cause == null)
    public static void initiateSystemFailure() throws FirstSystemFailure {
        throw new FirstSystemFailure("Проблема в ядре системы", null);
    }

    // Вызывает initiateSystemFailure и, при сбое, оборачивает его во второй уровень
    public static void triggerNavigationMalfunction() throws SecondSystemFailure {
        try {
            initiateSystemFailure();
        } catch (FirstSystemFailure e) {
            throw new SecondSystemFailure("Навигационная система отказала", e);
        }
    }

    // Вызывает triggerNavigationMalfunction и, при сбое, оборачивает его в третий уровень
    public static void provokeLifeSupportCrisis() throws ThirdSystemFailure {
        try {
            triggerNavigationMalfunction();
        } catch (SecondSystemFailure e) {
            throw new ThirdSystemFailure("Критический отказ системы жизнеобеспечения", e);
        }
    }

    public static void main(String[] args) {
        try {
            // Запускаем цепочку сбоев
            provokeLifeSupportCrisis();
        } catch (ThirdSystemFailure e) {
            // Печатаем полный стек-трейс с цепочкой причин (chained exceptions)
            e.printStackTrace();
        }
    }
}


class FirstSystemFailure extends Exception {
    public FirstSystemFailure(String message) {
        super(message);
    }

    public FirstSystemFailure(String message, Throwable cause) {
        super(message, cause);
    }
}

class SecondSystemFailure extends Exception {
    public SecondSystemFailure(String message) {
        super(message);
    }

    public SecondSystemFailure(String message, Throwable cause) {
        super(message, cause);
    }
}

class ThirdSystemFailure extends Exception {
    public ThirdSystemFailure(String message) {
        super(message);
    }

    public ThirdSystemFailure(String message, Throwable cause) {
        super(message, cause);
    }
}