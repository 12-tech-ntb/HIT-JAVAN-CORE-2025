import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int sv = 0;

        students[sv++] = new Student("Bac", 2006, "Nghe An", 7.5, 8, 9, 0);
        students[sv++] = new Student("Phuc", 2006, "Nghe An", 7.8, 8, 9, 1);
        students[sv++] = new Student("Hieu", 2006, "Ha Noi", 7, 8, 6, 0);
        students[sv++] = new Student("Vinh", 2006, "Nghe An", 7, 8, 6, 2);
        students[sv++] = new Student("Huy", 2006, "Nghe An", 7, 6, 8, 0);


        System.out.println("Danh sách sinh viên ban đầu:");
        for (int i = 0; i < sv; i++) {
            students[i].hienThiThongTin();
        }


        System.out.println("\nSắp xếp theo GPA:");
        for (int i = 0; i < sv - 1; i++) {
            for (int j = i + 1; j < sv; j++) {
                if (students[i].getGPA() > students[j].getGPA()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        for (int i = 0; i < sv; i++) {
            students[i].hienThiThongTin();
        }

        System.out.println("\nSửa thông tin sinh viên thứ 2:");
        students[1] = new Student("Phuc", 2006, "HCM", 9, 9, 9, 0);
        for (int i = 0; i < sv; i++) {
            students[i].hienThiThongTin();
        }

        // D
        System.out.println("\nXoá sinh viên thứ 4:");
        int xoaIndex = 3;
        for (int i = xoaIndex; i < sv - 1; i++) {
            students[i] = students[i + 1];
        }
        sv--;
        for (int i = 0; i < sv; i++) {
            students[i].hienThiThongTin();
        }

        System.out.println("\nSắp xếp theo số tiết nghỉ:");
        for (int i = 0; i < sv - 1; i++) {
            for (int j = i + 1; j < sv; j++) {
                if (students[i].getSoTietNghi() > students[j].getSoTietNghi()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        for (int i = 0; i < sv; i++) {
            students[i].hienThiThongTin();
        }

        System.out.println("\nSắp xếp theo tuổi:");
        for (int i = 0; i < sv - 1; i++) {
            for (int j = i + 1; j < sv; j++) {
                if (students[i].getAge() > students[j].getAge()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        for (int i = 0; i < sv; i++) {
            students[i].hienThiThongTin();
        }

        scanner.close();
    }
}
