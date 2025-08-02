public class SinhVien {
    // thuộc tính ( Giống với biến )
    private String hoTen;//Biến toàn cục
    private double diem;//Biến toàn cục


    //4.1 cóntructor mặc đinh
    //khởi tạo các giá trị mặc định
    //ngay khi đối tượng vừa được tạo ra
    public SinhVien(){
        hoTen = "No name";
        diem = 0.0;
    }
    //Alt + ins
    //4.2 cóntructor có đối số


    public SinhVien(String hoTen){
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {//Biến cục bộ
        this.hoTen = hoTen;//Dùng thí để phân biệt biến toàn cục và biến cục bộ
        this.diem = diem;//Nếu tên biến khác nhau thì không nhất thiết có this
    }

    //phuong thuc ( cac ham )
    //phuong thuc không có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen + ": "+ diem);
    }
}
