package org.example.Zadacha17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public double getTotalRevenue() {
        return orders.stream()
                .mapToDouble(Order::getTotalPrice)
                .sum();
    }

    public List<Order> getOrdersByCustomer(String customerName) {
        return orders.stream()
                .filter(order -> order.getCustomerName().equals(customerName))
                .collect(Collectors.toList());
    }

    public List<Order> getMostExpensiveOrders() {
        double maxPrice = orders.stream()
                .mapToDouble(Order::getTotalPrice)
                .max()
                .orElse(0);
        return orders.stream()
                .filter(order -> Double.compare(order.getTotalPrice(), maxPrice) == 0)
                .collect(Collectors.toList());
    }

    public int getOrderCount() {
        return orders.size();
    }

    @Override
    public String toString() {
        return "Все заказы: " + orders;
    }
}
