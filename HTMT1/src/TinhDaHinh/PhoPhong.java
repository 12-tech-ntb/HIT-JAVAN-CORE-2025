package TinhDaHinh;
//muốn kế thừa các phương thức của interface thì ta dùng implements(dẫn xuất)
//muốn kế thừa các phương thức từ các class thì ta dùng extends
public class PhoPhong extends NhanSu{
    public PhoPhong(String ten, String cccd, String que) {
        super(ten, cccd, que);
    }

    public PhoPhong(String ten, String cccd) {
        super(ten, cccd);
    }

    public PhoPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 40*ngayCong;
        //40$ một ngày
    }
}
