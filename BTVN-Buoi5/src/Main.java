import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n=== Nhập thông tin sinh viên thứ " + (i + 1) + " ===");
            students[i] = new Student();
            students[i].input();
        }

        System.out.println("\n=== Danh sách sinh viên ===");
        for (int i = 0; i < n; i++) {
            System.out.println("\nSinh viên thứ " + (i + 1) + ":");
            students[i].output();
        }
    }
}