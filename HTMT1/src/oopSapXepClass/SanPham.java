package oopSapXepClass;

public class SanPham implements Comparable<SanPham>{
    //thuộc tính
    private int ma;
    private String ten;
    private double gia;
    //contractor

    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    //get,set
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    //tostring

    @Override
    public String toString() {
        return "SanPham(" +
                "ma=" + ma +
                ", ten=" + ten +
                ", gia=" + gia +
                ')';
    }

    @Override
    public int compareTo(SanPham o) {
        return this.ten.compareToIgnoreCase(o.ten);//so sánh ko phân biệt chữ hoa chữ thường
    }

    //phương thức
    //sắp xếp theo giá
//    public int compareTo(SanPham o) {//phuong thuc sap xep
//        if(this.gia<o.gia)//nếu muốn sắp xếp theo chiều giảm dần thì this.gia <0.gia sẽ trả về 1
//            return -1;
//        if(this.gia>o.gia)//còn this.gia>o.gia sẽ trả về -1
//            return 1;
//        return 0;
// }
}
