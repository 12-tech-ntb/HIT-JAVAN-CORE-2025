public class Book {
    private static int nextId=1;
    int bookId;
    String title;
    String author;
    double price;
    Publisher publisher;


    public Book( String title, String author, double price, Publisher publisher) {
        this.bookId = nextId++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(String title, String author, double price) {
        this(title, author, price, new Publisher("Unknown", "Unknown"));
    }

    public void displayInfo(boolean showPublisher) {
        System.out.print("ID: " + bookId + ", " + title + ", " + author + ", " + price);
        if (showPublisher) System.out.println(", Publisher: " + publisher);
        else System.out.println(", Publisher: Unknown");
    }

}
