package java_practice.javarush.level25.lecture05;

public class Solution2 {
    public static void main(String[] args) {
        UserAccessService service = new UserAccessService();

        try {
            // Имитация неудачной попытки входа: неверный пароль
            service.authenticateUser("agent007", "wrong");

            // Если исключения не было — доступ разрешен
            System.out.println("Доступ разрешён.");
        } catch (SecurityBreachException e) {
            // Перехватываем по базовому типу — демонстрация полиморфизма
            System.out.println("Произошёл сбой безопасности: " + e.getMessage());
        }
    }
}

class SecurityBreachException extends Exception {
    public SecurityBreachException(String message) {
        super(message);
    }
}

class AuthenticationFailedException extends SecurityBreachException {
    public AuthenticationFailedException(String message) {
        super(message);
    }
}

class UserAccessService {
    void authenticateUser(String login, String password) throws AuthenticationFailedException {
        throw new AuthenticationFailedException("Неверный пароль");
    }
}