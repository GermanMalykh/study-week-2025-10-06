package java_practice.javarush.level22.lecture03;

import java.util.Objects;

public class Solution4 {
    public static void main(String[] args) {

        record Product(String title, double price) {
            @Override
            public boolean equals(Object o) {
                if (o == null || getClass() != o.getClass()) return false;

                Product product = (Product) o;
                return Objects.equals(title, product.title);
            }

            @Override
            public int hashCode() {
                int result = Objects.hashCode(title);
                return result;
            }
        }
        // Создаем два товара с одинаковым названием и разной ценой
        Product p1 = new Product("Кружка", 199.99);
        Product p2 = new Product("Кружка", 149.49);

        // Проверяем эквивалентность по equals (ожидаем true)
        System.out.println(p1.equals(p2));

        // Проверяем совпадение хеш-кодов (ожидаем true)
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}
