public class Book {
    private static int nextId=1;//biến static để tự động tăng bookId
    int bookId;//mã sách
    String title;//tên sách
    String author;//tên tác giả
    double price;//giá sach
    Publisher publisher;//nhà xuất bản


    public Book( String title, String author, double price, Publisher publisher) {//contructor có tham số
        this.bookId = nextId++;//mỗi lần sách tạo mới thì id tự tăng
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(String title, String author, double price) {//contructor ko truyền publisher mặc định nhà xuất bản là ko biết
        this(title, author, price, new Publisher("Unknown", "Unknown"));
    }

    public void displayInfo(boolean showPublisher) {//Phương thức này in ra thông tin cơ bản
        System.out.print("ID: " + bookId + ", " + title + ", " + author + ", " + price);
        if (showPublisher) System.out.println(", Publisher: " + publisher);//nếu showPublisher = true thì sẽ in thêm thông tin nhà xuất bản kèm với thông tin cơ bản của sách (showPublisher = true khi trong phần nhập thông tin từ bàn phím có thông tin nhà xuất bản)
        else System.out.println(", Publisher: Unknown");//nếu sai thì in thông tin nhà xuất bản là unknow
    }

}
