package Testinterface;

public class KeThuainterface2 implements ViDuinterface,ViDuinterface2{

    @Override
    public void thongTin(String ten, String cccd, int namSinh) {
    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return 0;
    }

    @Override
    public void setThuong(int cccd, double doanhThu) {

    }
    //Các class con kế thừa từ từ interface đề phải ghi đè(override) lại các phương thức trừ tương

}
