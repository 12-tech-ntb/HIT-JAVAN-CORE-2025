import java.util.Scanner;

// Lớp PhongMay
class PhongMay {
    private String maPhong;   // Mã phòng
    private String tenPhong;  // Tên phòng
    private double dienTich;  // Diện tích phòng
    private QuanLy x;          // Đối tượng quản lý
    private May[] y;           // Mảng các máy
    private int n;             // Số lượng máy

    // Constructor
    public PhongMay() {
        x = new QuanLy(); // Khởi tạo đối tượng quản lý
    }

    // Hàm nhập thông tin phòng máy
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");
        maPhong = sc.nextLine(); // Nhập mã phòng
        System.out.print("Nhập tên phòng: ");
        tenPhong = sc.nextLine(); // Nhập tên phòng
        System.out.print("Nhập diện tích phòng: ");
        dienTich = sc.nextDouble(); // Nhập diện tích
        sc.nextLine(); // Bỏ qua dòng trống

        System.out.println("--- Nhập thông tin quản lý ---");
        x.nhap(); // Gọi hàm nhập của quản lý

        System.out.print("Nhập số lượng máy: ");
        n = sc.nextInt(); // Nhập số lượng máy
        sc.nextLine(); // Bỏ qua dòng trống

        y = new May[n]; // Cấp phát mảng máy

        for (int i = 0; i < n; i++) { // Vòng lặp nhập thông tin từng máy
            System.out.println("\n=== Nhập thông tin máy thứ " + (i + 1) + " ===");
            y[i] = new May(); // Tạo máy mới
            y[i].nhap(); // Nhập thông tin máy
        }
    }

    // Hàm xuất thông tin phòng máy
    public void xuat() {
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích: " + dienTich);

        System.out.println("--- Thông tin quản lý ---");
        x.xuat(); // Xuất thông tin quản lý

        System.out.println("--- Danh sách máy ---");
        for (int i = 0; i < n; i++) { // Vòng lặp xuất thông tin từng máy
            System.out.println("\nMáy thứ " + (i + 1) + ":");
            y[i].xuat();
        }
    }
}