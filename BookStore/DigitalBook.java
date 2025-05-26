public class DigitalBook extends Book {
    private int fileSizeKB;

    public DigitalBook(String isbn, String title, String author, double price, int fileSizeKB) {
        super(isbn, title, author, price);
        this.fileSizeKB = fileSizeKB;
    }

    @Override
    public String getDetails() {
        return "File Size: " + fileSizeKB + " KB";
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getDetails();
    }
}