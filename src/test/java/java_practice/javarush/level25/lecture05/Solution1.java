package java_practice.javarush.level25.lecture05;

public class Solution1 {
    public static void main(String[] args) {
        // Создаем два объекта SystemCore, чтобы увидеть порядок инициализации.
        // При первом создании класса сначала выполнится статический блок (один раз за всю программу)
        SystemCore s1 = new SystemCore();
        SystemCore s2 = new SystemCore();

        // При втором создании выполнится только нестатический блок (статический уже отработал).

    }
}

class SystemCore {
    static {
        System.out.println("Система: глобальная инициализация завершена.");
    }

    {
        System.out.println("Компонент: индивидуальная настройка завершена.");
    }
}