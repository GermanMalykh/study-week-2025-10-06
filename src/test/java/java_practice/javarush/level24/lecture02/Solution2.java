package java_practice.javarush.level24.lecture02;

public class Solution2 {
    public static void main(String[] args) {
        try {
            // Симулируем установку слишком короткого пароля
            PasswordGuard pass = new PasswordGuard();
            pass.enforcePasswordStrength("123");
        } catch (WeakPasswordException e) {
            // Перехватываем и выводим сообщение из исключения
            System.out.println(e.getMessage());
        }
    }
}

// Собственное проверяемое исключение, наследуется от Exception
class WeakPasswordException extends Exception {
    // Конструктор, принимающий сообщение и передающий его в суперкласс
    public WeakPasswordException(String message) {
        super(message);
    }
}

class PasswordGuard {
    protected void enforcePasswordStrength(String password) throws WeakPasswordException {
        if (password.length() < 6) {
            throw new WeakPasswordException("Пароль слишком короткий!");
        }
    }
}