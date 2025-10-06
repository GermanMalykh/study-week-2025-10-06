package java_practice.javarush.level22.lecture05;

class FlexibleUser {
    private String name;
    private int age;

    public FlexibleUser(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "FlexibleUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

record FixedUser(String name, int age) {}

public class Solution4 {
    public static void main(String[] args) {
        // Создаём "гибкий" профиль (обычный класс)
        FlexibleUser flexible = new FlexibleUser("Иван", 30);
        System.out.println("Гибкий профиль (до изменений): " + flexible);

        // Меняем имя и возраст с помощью сеттеров
        flexible.setName("Пётр");
        flexible.setAge(25);
        System.out.println("Гибкий профиль (после изменений): " + flexible);

        // Создаём "фиксированный" профиль (record)
        FixedUser fixed = new FixedUser("Анна", 28);
        System.out.println("Фиксированный профиль (record): " + fixed);

//        fixed.setName("Мария");   // Ошибка компиляции: у record нет сеттера setName
//        fixed.age = 29;           // Ошибка компиляции: поле age недоступно и final
//        fixed.name("Мария");      // Ошибка компиляции: метод name() — геттер без параметров
    }
}
