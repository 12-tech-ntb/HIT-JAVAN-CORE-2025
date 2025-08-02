package Java;

public class SinhVien {
    private String maSinhVien;//chỉ được dùng trong class tạo ra nó
    public String name;//truy cập ở cả bên ngoài
    protected int age;//trong cùng 1 package có thể dử dụng được
    int diem;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String name, int age, int diem) {
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.age = age;
        this.diem = diem;
    }
    public String getMaSinhVien(){
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }
}
