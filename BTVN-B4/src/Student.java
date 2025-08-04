public class Student {
    private String ten;
    private int namSinh;
    private String diaChi;
    private double tx1;
    private double tx2;
    private double diemKTHP;
    private int soTietNghi;

    public Student(String ten, int namSinh, String diaChi, double tx1, double tx2, double diemKTHP, int soTietNghi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.diemKTHP = diemKTHP;
        this.soTietNghi = soTietNghi;
    }
    public int getAge(){
        return 2025-namSinh;
    }

    public String getTen() {
        return ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getTx1() {
        return tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public double getDiemKTHP() {
        return diemKTHP;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public double getGPA(){
        return tx1*0.2+tx2*0.3+diemKTHP*0.5;
    }

    public void hienThiThongTin() {
        double gpa = tx1 * 0.2 + tx2 * 0.3 + diemKTHP * 0.5;

        System.out.println("Tên: " + ten +
                ", Địa chỉ: " + diaChi +
                ", TX1: " + tx1 +
                ", TX2: " + tx2 +
                ", KTHP: " + diemKTHP +
                ", GPA: " + gpa +
                ", Tiết nghỉ: " + soTietNghi +
                ", Tuổi: " + (2025 - namSinh));
    }
}
