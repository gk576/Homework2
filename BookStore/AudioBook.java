public class AudioBook extends Book {
    private int durationMinutes;
    private String narrator;

    public AudioBook(String isbn, String title, String author, double price,
                     int durationMinutes, String narrator) {
        super(isbn, title, author, price);
        this.durationMinutes = durationMinutes;
        this.narrator = narrator;
    }

    @Override
    public String getDetails() {
        return "Duration: " + durationMinutes + " min" +
                ", Narrator: " + narrator;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getDetails();
    }
}