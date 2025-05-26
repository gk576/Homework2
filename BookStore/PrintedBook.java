public class PrintedBook extends Book {
    private String bindingType; // hardcover / paperback
    private int pageCount;
    private String publisher;
    private int availableCopies;

    public PrintedBook(String isbn, String title, String author, double price,
                       String bindingType, int pageCount, String publisher, int availableCopies) {
        super(isbn, title, author, price);
        this.bindingType = bindingType;
        this.pageCount = pageCount;
        this.publisher = publisher;
        this.availableCopies = availableCopies;
    }

    @Override
    public String getDetails() {
        return "Binding: " + bindingType +
                ", Pages: " + pageCount +
                ", Publisher: " + publisher +
                ", Copies Available: " + availableCopies;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getDetails();
    }
}