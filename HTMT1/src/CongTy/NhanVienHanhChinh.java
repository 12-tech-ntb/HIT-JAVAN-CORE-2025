package CongTy;

public class NhanVienHanhChinh extends NhanVien {
    public NhanVienHanhChinh(String ten, String que, int cccd) {
        super(ten, que, cccd); //gọi contructor từ class cha bằng từ khóa super
    }

    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
}
