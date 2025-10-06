package java_practice.javarush.level22.lecture01;

record Student(String name, int age) {
}

public class Solution2 {
    public static void main(String[] args) {
        // Создаем запись для вымышленного студента
        Student student = new Student("Иван Петров", 20);

        // Сначала выводим только имя, затем только возраст — через accessor-методы записи
        System.out.println(student.name()); // метод доступа для компонента name
        System.out.println(student.age());  // метод доступа для компонента age
    }
}
