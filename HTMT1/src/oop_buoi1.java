import TruongDH.SinhVien;

public class oop_buoi1 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng thuộc class sinh viên
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Bắc");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Bắc",10);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        // Muốn thay đổi tên của sv4
        sv4.setHoTen("Black");
        sv4.hienThiThongTin();
        // Muốn thay đổi điểm cuả sv4
        sv4.setDiem(25);
        sv4.hienThiThongTin();
        // Có kiểu trả về mới gắn biến để lưu kết quả trả về
        double dTB = sv4.tinhDTB(8,9);
        System.out.println("Điểm trung binhg la: "+dTB);
        // Muốn xem phương thức nào thì chuột trái ctrl vào phương thức thì sẽ tự động tìm đến phưong thức đó ở hàm khởi tạo

        // Test phương thức toString
        System.out.println(sv4);// Khi xuất trực tiếp như thế này thì chương trình sẽ hiểu là đang dùng phương thức toString
        // 11. Support Method và Sẻvice Method
        sv4.checkHopLeDiem();
        // 12. overloading Method
        double testD1 = sv4.tinhDTB(5,6,7);
        System.out.println("Điểm trung bình la: "+ testD1);
        double testD2 = sv4.tinhDTB(8,9);
        System.out.println("Điểm trung bình la: "+testD2);

        // 13. Parametter LIst
        double tongDiem = sv4.tongDiem(1,2,5,6,7,8,9);
        System.out.println("Diem la: "+ tongDiem);
    }
}
