package dz1.Shop;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product1 = new Product("Товар 1", 50);
        Product product2 = new Product("Товар 2", 40);
        Product product3 = new Product("Товар 3", 30);
        Product product4 = new Product("Товар 4", 20);
        Product product5 = new Product("Товар 5", 10);
        shop.setProducts(List.of(product1, product2, product3, product4, product5));

//        System.out.println(shop.getProducts());
//        System.out.println(shop.sortProductsByPrice());
//        System.out.println(shop.getMostExpensiveProduct());

        // Тесты, чтобы проверить, что магазин хранит верный список продуктов
        // (правильное количество продуктов, верное содержимое корзины).
        assertThat(shop.getProducts()).contains(product1, product2, product3, product4, product5);
        assertThat(shop.getProducts()).size().isEqualTo(5);

        // Тесты для проверки корректности работы метода getMostExpensiveProduct.
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(50);
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(20);

        // Тесты для проверки корректности работы метода sortProductsByPrice.
        assertThat(shop.sortProductsByPrice()).containsExactly(product5, product4, product3, product2, product1);
    }
}