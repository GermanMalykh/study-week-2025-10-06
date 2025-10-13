package java_practice.javarush.level24.lecture03;

public class Solution3 {
    public static void main(String[] args) {
        try {
            // Симулируем "внешнюю ошибку" с конкретной причиной (цепочка исключений)
            throw new InputValidationException("Внешняя ошибка обработки ввода",
                    new IllegalArgumentException("Передан некорректный формат данных")
            );

        } catch (InputValidationException e) {
            // 1) сообщение внешнего исключения
            new IllegalArgumentException("Передан некорректный формат данных");
            System.out.println(e.getMessage());

            // 2) сообщение исключения-источника (корня)
            new InputValidationException("Внешняя ошибка обработки ввода");
            System.out.println(e.getCause().getMessage());

            // 3) имя класса исключения-источника
            System.out.println(e.getCause().getClass().getName());
        }
    }
}


class InputValidationException extends Exception {
    public InputValidationException(String message) {
        super(message);
    }

    public InputValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}