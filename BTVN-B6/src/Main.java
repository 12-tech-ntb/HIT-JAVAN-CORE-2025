//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java Cơ Bản", "Nguyen A", 100, new Publisher("NXB Trẻ", "Hà Nội")));
        lib.addBook(new Book("Lập Trình OOP", "Tran B", 150)); // không truyền publisher
        lib.addBook(new Book("Cấu Trúc Dữ Liệu", "Nguyen A", 200, new Publisher("NXB Giáo Dục", "HCM")));

        System.out.println("Danh sách sách:");
        lib.displayAllBooks(true);

        System.out.println("\nTìm sách của 'Nguyen A':");
        lib.searchByAuthor("Nguyen A");

        System.out.println("\nXóa sách ID=2...");
        lib.removeBookById(2);

        System.out.println("\nDanh sách sau khi xóa:");
        lib.displayAllBooks(true);
    }
}

