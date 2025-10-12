package java_practice.javarush.level23.lecture01;

public class Solution4 {
    public static void main(String[] args) {
        Product p1 = new Product("Молоко");
        System.out.println(p1.getProductName());
    }
}


class Product {
    // Приватное строковое поле — имя товара недоступно напрямую извне
    private String productName;

    // Конструктор, который обязательно принимает имя товара
    public Product(String productName) {
        // Сразу сохраняем переданное имя в приватное поле
        this.productName = productName;
    }

    // Геттер для чтения имени товара (само поле остаётся private)
    public String getProductName() {
        return productName;
    }

}