package QuanLyDiem;

public class TestDiem {
    public static void main(String[] args) {
        //khởi tạo khoa toán
        KhoaToan toan1 = new KhoaToan("Nguyen Tat Bac", "9999999");
        toan1.tinhDTB();

        KhoaAnh anh1 = new KhoaAnh("Vinh","22222");
        anh1.tinhDTB();//tên phương thức giống hệt nhau tuy nhiên khi gọi phương thức thì nó sẽ tùy vào phương thức ở class nào để gọi lên cho hợp lý

    }
}
