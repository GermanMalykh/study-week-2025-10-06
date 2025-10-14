package java_practice.javarush.level25.lecture03;

public class Solution2 {
}

class EmailClient {

    // Нестатический внутренний класс: письмо существует только в контексте EmailClient
    class Email {
        protected String content;

        public Email(String content) {
            this.content = content;
        }
    }

    // Метод, который "составляет" письмо и возвращает новый объект Email
    public Email composeEmail(String messageContent) {
        // Создаем письмо, привязанное к текущему экземпляру EmailClient
        return new Email(messageContent);
    }

    public static void main(String[] args) {
        // Создаем почтовый клиент
        EmailClient client = new EmailClient();

        // Составляем тестовое письмо через метод composeEmail
        Email email = client.composeEmail("текст");

        // Проверяем, что письмо создано: выводим его содержимое
        System.out.println(email.content);
    }
}