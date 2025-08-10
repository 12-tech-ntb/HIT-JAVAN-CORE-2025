import java.util.Scanner;

class Student {
    private String name;
    private String lop;
    private double score;
    private Faculty y;

    public Student() {
        y = new Faculty();
    }

    public Student(String name, String lop, double score, Faculty y) {
        this.name = name;
        this.lop = lop;
        this.score = score;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop = sc.nextLine();
        System.out.print("Nhập điểm: ");
        score = sc.nextDouble();
        sc.nextLine(); // bỏ qua dòng thừa
        System.out.println("--- Nhập thông tin khoa ---");
        y.input();// Gọi hàm nhập Faculty (và nhập luôn School bên trong)
    }

    public void output() {
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Lớp: " + lop);
        System.out.println("Điểm: " + score);
        System.out.println("--- Thông tin khoa ---");
        y.output();// Gọi hàm in Faculty (và in luôn School bên trong)
    }
}
