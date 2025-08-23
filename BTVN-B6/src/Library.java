import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();//dùng arraylist đẻ lưu danh sách book

    public void addBook(Book b){//tham số b là một đối tượng Book được truyền từ bên ngoài khi gọi hàm
        books.add(b);//thêm phần tự vào cuối danh sách
    }

    public void displayAllBooks(boolean showPublisher){//hiện thị tất cả sách
        for(Book b : books ){//duyệt qua tất cả các sách có tròn arrlist
           b.displayInfo(true);//gọi phương thức displayInfo của đối tượng b
            //displayInfo(true) sẽ in ra **thông tin sách kèm thông tin nhà xuất bản** (`true` nghĩa là có hiển thị Publisher).
        }
    }

    public void searchByAuthor(String author) {// Đây là **phương thức** có tên `searchByAuthor`
        for (Book b : books) {//nó nhận một tham số `author` kiểu `String` (tên tác giả mà người dùng muốn tìm)
            if (b.author.equalsIgnoreCase(author)) {//`public` nghĩa là có thể gọi phương thức này từ bên ngoài lớp
                b.displayInfo(true);// `void` nghĩa là phương thức **không trả về kết quả**, chỉ thực hiện công việc tìm kiếm rồi in ra
            }
        }
        //`b.author` là tác giả của quyển sách hiện tại (đối tượng `b`)
        //`equalsIgnoreCase(author)` là phương thức so sánh chuỗi trong Java, **không phân biệt chữ hoa chữ thường**
    }

    public void removeBookById(int id) {
        books.removeIf(b -> b.bookId == id); //removeIf sẽ xóa phần tử thỏa điều kiện (bookId == id)
    }
    //cú phaps tổng quát: arrayList.removeIf(điều_kiện);
}
