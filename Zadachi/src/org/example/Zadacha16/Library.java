package org.example.Zadacha16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> findByAuthor(String author) {
        //Stream API
        //return books.stream()
        //        .filter(book -> book.getAuthor().equals(author))
        //        .collect(Collectors.toList());
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public double getTotalPrice() {
        //Stream API
        //return books.stream ()
        //        .mapToDouble(Book:getPrice)
        //        .sum();
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice = totalPrice + book.getPrice();
        }
        return totalPrice;
    }

    public List<Book> getBooksSortedByYear() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getYear))
                .collect(Collectors.toList());
    }

    public int getBookCount() {
        return books.size();
    }

    public void printAll() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
