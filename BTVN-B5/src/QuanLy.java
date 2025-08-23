import java.util.Scanner;

// Lớp QuanLy
class QuanLy {
    private String maQL;   // Mã quản lý
    private String hoTen;  // Họ tên quản lý

    // Hàm nhập thông tin quản lý
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã quản lý: ");
        maQL = sc.nextLine();  // Nhập mã quản lý
        System.out.print("Nhập họ tên quản lý: ");
        hoTen = sc.nextLine(); // Nhập họ tên quản lý
    }

    // Hàm xuất thông tin quản lý
    public void xuat() {
        System.out.println("Mã quản lý: " + maQL);
        System.out.println("Họ tên quản lý: " + hoTen);
    }
}