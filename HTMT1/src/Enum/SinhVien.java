package Enum;

public class SinhVien {
    //thuoc tinh
    private int ma;
    private String ten;
    private double dtb;
    private XepLoai loai;//Kiểu dữ liệu xếp loại la enum XepLoai
    //contructor

    public SinhVien(int ma, String ten, double dtb) {
        this.ma = ma;
        this.ten = ten;
        this.dtb = dtb;
        this.loai = getLoai();
        //xếp loại ko cần truyền vào vì nó là biến sau khi tính toán mới biết nó không được truyền vào ngay từ ban đầu nên ko cần có trong contuctor

    }
    //phuong thuc de getloai
    public XepLoai getLoai(){
        if(this.dtb>=8)
            loai=XepLoai.gioi;
        else if(this.dtb>=6.5)
            loai=XepLoai.kha;
        else if(this.dtb>=5.0)
            loai=XepLoai.tb;
        else if(this.dtb>=3.0)
            loai=XepLoai.yeu;
        else
            loai=XepLoai.duoihoc;
        return loai;
    }


    //tostring
    @Override
    public String toString() {
        return "SinhVien(" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", dtb=" + dtb +
                ", loai=" + loai +
                ')';
    }
}
