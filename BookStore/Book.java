public abstract class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    public abstract String getDetails();

    @Override
    public String toString() {
        return "ISBN: " + isbn +
                ", Title: " + title +
                ", Author: " + author +
                ", Price: $" + String.format("%.2f", price);
    }
}