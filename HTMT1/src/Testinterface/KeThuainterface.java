package Testinterface;

public class KeThuainterface implements ViDuinterface{
    @Override
    public void thongTin(String ten, String cccd, int namSinh) {
        //Bắt buộc phải ghi đè override lại các phương thức trừu tượng của lớp cha
    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return luongNgay*soNgayCong;
        //Bắt buộc phải ghi đè override lại các phương thức trừu tượng của lớp cha
    }
}
