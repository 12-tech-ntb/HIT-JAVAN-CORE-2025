package CongTy;

public abstract class NhanVien {
    protected String ten;
    protected String que;
    protected int cccd;
    protected double luongCoBan = 850;

    //contructor alt ins

    public NhanVien(String ten, String que, int cccd) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
    }
    public abstract double tinhLuong();
    //trong class có phương thức trừu tượng thì bắt buộc class cũng phải là trừ tượng (abstract)
    //trong phương thức trừu tượng thì không có phần thân ỏ nội dung hàm
}
