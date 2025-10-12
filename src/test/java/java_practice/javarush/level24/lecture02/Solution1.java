package java_practice.javarush.level24.lecture02;

public class Solution1 {
    public static void main(String[] args) {
        try {
            // Пробуем слишком маленький счёт — ожидаем исключение
            checkPlayerScore(5);
            System.out.println("Этот текст не будет выведен");
        } catch (ScoreTooLowException e) {
            System.out.println(e.getMessage()); // Выведет: "Счёт игрока слишком низкий!"
        }

        try {
            // Пробуем корректный счёт — исключений быть не должно
            checkPlayerScore(12);
            System.out.println("Счёт 12 принят");
        } catch (ScoreTooLowException e) {
            System.out.println(e.getMessage());
        }
    }

    // Метод-страж: проверяет счёт и бросает собственное исключение при некорректном значении
    public static void checkPlayerScore(int score) throws ScoreTooLowException {

        // Сообщение должно быть строго таким, как в требованиях
        if (score < 10) {
            throw new ScoreTooLowException("Счёт игрока слишком низкий!");
        }
        // Если счёт 10 или больше — метод завершается без исключений
    }
}

class ScoreTooLowException extends Exception {
    // Конструктор принимает сообщение об ошибке и передаёт его базовому классу Exception
    public ScoreTooLowException(String message) {
        super(message);
    }
}