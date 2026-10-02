package org.example.Zadacha17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private String customerName;
    private List<Product> products = new ArrayList<>();
    public Order(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct (Product product) {
        products.remove(product);
    }

    public double getTotalPrice() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public int getProductCount() {
        return products.size();
    }

    public List<Product> getProductsByCategory(String category) {
        return products.stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Order{customer = " + customerName + ", products = " + products + "}";
    }

}
