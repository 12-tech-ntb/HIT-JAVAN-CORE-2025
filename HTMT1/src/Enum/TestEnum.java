package Enum;


import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
        // kiểm tra thứ tự các giá trị trong enum
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.yeu.ordinal());

        // tạo list danh sách
        ArrayList<SinhVien> ds = new ArrayList<>();

        // tạo đối tượng sinh viên
        SinhVien sv1 = new SinhVien(1, "Bac", 9.5);
        SinhVien sv2 = new SinhVien(2, "Vinh", 9.5);
        SinhVien sv3 = new SinhVien(3, "Huy", 9.5);

        // add các sinh viên vào cuối danh sách
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        for(SinhVien sv : ds){
            System.out.println(sv);
        }
    }
}
