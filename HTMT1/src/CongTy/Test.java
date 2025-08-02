package CongTy;

public class Test {
    public static void main(String[] arge){
//        NhanVien nv1 = new NhanVien("nhan vien","Nghe An",779991);
//        double luongnv1 = nv1.tinhLuong();
//        System.out.println("Luong nhan vien 1 la : "+luongnv1);

        //tạo đối tượng là nhân viên hành chính
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hành chính","Nghe An", 333333);
        double luonghc1 = hc1.tinhLuong();
        System.out.println("Luong cua hanh chinh 1 la : "+luonghc1);
        //ta có thể thấy trong class nhân viên không hề có phương thức tính lương cơ bản nhưng vì nó đã được mở rộng từ class sinh viên nên phương thức này vẫn được sử dụng ở các class con


        //tạo di ca
        NhanVienDiCa ca1 = new NhanVienDiCa("ca1 ", "Ha Noi", 555555);
        double luongca1 = ca1.tinhLuong();
        System.out.println("Luong cua ca 1 la: "+luongca1);

        NhanVienDiCa ca2 = new NhanVienDiCa("Tí","Hà Nội",99999,1);
        double ca2Luong = ca2.tinhLuong();
        System.out.println("Luong cua ca 2 la: "+ca2Luong);
        System.out.println("Ca làm la: "+ca2.ca);
    }
}
