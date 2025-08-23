package Testinterface;

public class KeThuainterface3 implements ViDuinterface3{
    @Override
    public void x(String x) {

    }

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
    //Vì ViDuinterface3 dùng extends(kế thừa) từ ViDUinterface và ViDUinterface2 nên khi calss KeThuainterface3 dẫn xuất từ interface3 nó bắt buộc phải ghi đè các phương thức có trogn interface,2,3
}
