package TinhDaHinh;

public class TestTinhDaHinh {
    public static void main(String[] args) {
        //NhanSu ns1 = new PhoPhong();
        NhanSu ns1 = new PhoPhong("Nguyen Tat Bac", "55555","Nghe An");
        //xuat luong pho phong
        System.out.println(ns1.tinhLuong(25));
        System.out.println("ns1 dang la pho phong");
        System.out.println("Thong tin cua ns1: "+ns1.getTen()+" "+ns1.getCccd()+" "+ns1.getQue());
        //thay doi chuc vu
        ns1 = new TRuongPhong(ns1.getTen(),ns1.getCccd(),ns1.getQue());//lay duoc thong tin dang co cua ns1 truoc do truyen vao khi ns1 dang la pho phong
        //in luong ns1 khi lam truong phong
        System.out.println("ns1 dang la tuowng phong");
        System.out.println("Thong tin cua ns1: "+ns1.getTen()+" "+ns1.getCccd()+" "+ns1.getQue());
        System.out.println(ns1.tinhLuong(25));
    }
}
