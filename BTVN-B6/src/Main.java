//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();//tạo một đối tượng Library

        lib.addBook(new Book("Java Cơ Bản", "Nguyen A", 100, new Publisher("NXB Trẻ", "Hà Nội")));          //nhập từ bàn phím thông tin 3 quyển sách
        lib.addBook(new Book("Lập Trình OOP", "Tran B", 150)); // không truyền publisher
        lib.addBook(new Book("Cấu Trúc Dữ Liệu", "Nguyen A", 200, new Publisher("NXB Giáo Dục", "HCM")));

        System.out.println("Danh sách sách:");
        lib.displayAllBooks(true);//in ra màn hình thông tin sách cơ bản của từng quyển

        System.out.println("\nTìm sách của 'Nguyen A':");//tìm các quyển sách có cùng tác giả
        lib.searchByAuthor("Nguyen A");

        System.out.println("\nXóa sách ID=2...");//xóa quyển sách có id bằng 2
        lib.removeBookById(2);

        System.out.println("\nDanh sách sau khi xóa:");//in lại thông tin sách sau khi đáx xóa sách có ID = 2 
        lib.displayAllBooks(true);
    }
}

