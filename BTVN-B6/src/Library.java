import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b){
        books.add(b);
    }

    public void displayAllBooks(boolean showPublisher){
        for(Book b : books ){
           b.displayInfo(true);
        }
    }

    public void searchByAuthor(String author) {
        for (Book b : books) {
            if (b.author.equalsIgnoreCase(author)) {
                b.displayInfo(true);
            }
        }
    }

    public void removeBookById(int id) {
        books.removeIf(b -> b.bookId == id);
    }
}
