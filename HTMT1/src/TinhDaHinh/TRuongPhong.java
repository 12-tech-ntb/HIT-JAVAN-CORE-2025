package TinhDaHinh;
//muốn kế thừa các phương thức của interface thì ta dùng implements(dẫn xuất)
//muốn kế thừa các phương thức từ các class thì ta dùng extends
public class TRuongPhong extends NhanSu{
    public TRuongPhong(String ten, String cccd, String que) {
        super(ten, cccd, que);
    }

    public TRuongPhong(String ten, String cccd) {
        super(ten, cccd);
    }

    public TRuongPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 50*ngayCong;
        //50$ một ngày
    }
}
