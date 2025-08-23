import java.util.Scanner;

// Lớp May
class May {
    private String maMay;    // Mã máy
    private String tenMay;   // Tên máy
    private String tinhTrang;// Tình trạng máy

    // Hàm nhập thông tin máy
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã máy: ");
        maMay = sc.nextLine();  // Nhập mã máy
        System.out.print("Nhập tên máy: ");
        tenMay = sc.nextLine(); // Nhập tên máy
        System.out.print("Nhập tình trạng máy: ");
        tinhTrang = sc.nextLine(); // Nhập tình trạng máy
    }

    // Hàm xuất thông tin máy
    public void xuat() {
        System.out.println("Mã máy: " + maMay);
        System.out.println("Tên máy: " + tenMay);
        System.out.println("Tình trạng: " + tinhTrang);
    }
}