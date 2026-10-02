package org.example.Zadacha17;

public class Main {
    static void Main(String[] args) {
        Shop shop = new Shop("МАГАЗИНЧИК");
        Order order1 = new Order("Саня");
        Order order2 = new Order("Санёчек");
        Order order3 = new Order("Санёчек");

        order1.addProduct(new Product("Кабачок", "Овощи", 52.67, 2));
        order1.addProduct(new Product("Морковь", "Овощи", 69.12, 3));
        order2.addProduct(new Product("Стол", "Мебель", 4123, 3));
        order2.addProduct(new Product("Огурец", "Овощи", 180, 4));
        order3.addProduct(new Product("Телефон", "Техника", 100000, 1));

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);

        System.out.println("общая выручка: " + shop.getTotalRevenue());
        System.out.println("заказы санёчка: " + shop.getOrdersByCustomer("Санёчек"));
        System.out.println("самый дорогой заказ: " + shop.getMostExpensiveOrders());
        System.out.println("кол-во заказов: " + shop.getOrderCount());
        System.out.println(shop.toString());
    }
}
