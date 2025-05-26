import java.util.ArrayList;

public class BookStore {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Add some sample books
        books.add(new PrintedBook("978-3-16-148410-0", "Java Programming", "John Doe", 49.99,
                "Hardcover", 500, "Tech Books Inc.", 20));

        books.add(new DigitalBook("978-1-56619-909-4", "Python for Beginners", "Jane Smith", 29.99, 1200));

        books.add(new AudioBook("978-0-262-13472-9", "The Art of Computer Science", "Donald Knuth", 39.99,
                720, "David Reader"));

        books.add(new PrintedBook("978-1-4000-4472-1", "Data Structures & Algorithms", "Mark Allen Weiss", 69.99,
                "Paperback", 700, "Pearson", 10));

        books.add(new DigitalBook("978-1-119-40297-2", "Clean Code", "Robert C. Martin", 34.99, 950));

        books.add(new AudioBook("978-1-4555-8234-1", "Design Patterns", "Erich Gamma", 44.99, 600, "Alex Voice"));

        // Display all books
        System.out.println("=== BOOKSTORE CATALOG ===\n");
        for (Book book : books) {
            System.out.println(book);
            System.out.println("--------------------------");
        }
    }
}
