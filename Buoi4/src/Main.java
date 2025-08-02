import Java.SinhVien;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student sinhVienA = new Student();
        sinhVienA.maSinhVien = "2024602364";
        System.out.println(sinhVienA.maSinhVien);
        sinhVienA.xinChao();
        SinhVien a = new SinhVien();
        a.name = "Bac";
//        a.maSinhVien = "2024602364";//không dùng được vì max sinh viên được khai báo bằng private
    }
}