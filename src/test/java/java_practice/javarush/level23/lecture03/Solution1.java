package java_practice.javarush.level23.lecture03;

public class Solution1 {
    public static void main(String[] args) {
        // Создаем новый автомобиль и заполняем его данные
        Car newCar = new Car(); // объект нашей "картотеки"
        newCar.carBrand = "Toyota";       // марка автомобиля
        newCar.productionYear = 2022;     // год выпуска

        // Выводим информацию, чтобы убедиться, что данные внесены
        System.out.println("Марка: " + newCar.carBrand);
        System.out.println("Год выпуска: " + newCar.productionYear);
    }
}

class Car {
    public String carBrand;
    public int productionYear;
}