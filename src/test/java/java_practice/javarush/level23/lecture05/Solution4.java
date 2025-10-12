package java_practice.javarush.level23.lecture05;

public class Solution4 {
    public static void main(String[] args) {
        // Создаем один продукт и проверяем работу геттера
        Product banana = new Product("Банан");
        System.out.println(banana.getProductName());
    }
}

class Product {
    protected static int totalProductCount;
    protected String productName;

    public Product(String name) {
        productName = name;
        totalProductCount++;
    }

    public String getProductName() {
        return productName;
    }
}