import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, price);
    }

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year > 0) this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) this.price = price;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author +
                "', year=" + year + ", price=" + price + "}";
    }

}
