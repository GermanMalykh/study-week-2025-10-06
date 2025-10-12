package java_practice.javarush.level23.lecture03;

public class Solution3 {
}

class User {
    // Приватное строковое поле: доступно только внутри класса User
    private String userPassword;
}

// Сервис для работы с пользователями
class UserService {
    public static void main(String[] args) {
        // Создаем объект пользователя
        User user = new User();

        // Попытка напрямую присвоить значение приватному полю из другого класса:
//        user.userPassword = "12345";
    }
}
