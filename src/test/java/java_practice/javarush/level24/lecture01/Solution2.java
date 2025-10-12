package java_practice.javarush.level24.lecture01;

public class Solution2 {
    public static void main(String[] args) {
        // Общее исключение, которое можно обработать
        Exception generalSystemIssue = new Exception();

        // Фатальная ошибка, указывающая на проблему уровня JVM
        Error catastrophicFailure = new Error();

        // Проверяем на уровне классов: является ли класс переменной наследником Throwable
        if (generalSystemIssue instanceof Throwable) {
            System.out.println(generalSystemIssue.getClass().getName());
        }

        if (catastrophicFailure instanceof Throwable) {
            System.out.println(catastrophicFailure.getClass().getName());
        }

    }
}
