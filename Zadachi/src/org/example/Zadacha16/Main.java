package org.example.Zadacha16;

public class Main {
    static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Book1", "Tolstoi", 1924, 5000));
        library.addBook(new Book("Book2", "Tolstoi", 1812, 15000));
        library.addBook(new Book("Book3", "Lermontov", 1693, 5060));
        library.addBook(new Book("Book4", "Pushkin", 1834, 5980));
        library.addBook(new Book("Book5", "Gogol", 1823, 9200));

        System.out.println("Книги Толстого: " + library.findByAuthor("Tolstoi"));
        System.out.println("Общая цена: " + library.getTotalPrice());
        System.out.println("Книги, сортированные по году: " + library.getBooksSortedByYear());
        library.removeBook(library.findByAuthor("Gogol").get(0));
        System.out.println("Количество книг: " + library.getBookCount());
        library.printAll();
    }
}
