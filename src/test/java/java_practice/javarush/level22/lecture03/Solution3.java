package java_practice.javarush.level22.lecture03;

public class Solution3 {
    public static void main(String[] args) {
        record UserProfile(String name, int age) {
            @Override
            public String toString() {
                return "Пользователь: " + name + " (" + age + " лет)";
            }
        }
        // Создаем пользователя с произвольными данными
        UserProfile user = new UserProfile("Алиса", 25);

        // Печатаем объект — будет вызван наш переопределенный toString()
        System.out.println(user);
    }
}
