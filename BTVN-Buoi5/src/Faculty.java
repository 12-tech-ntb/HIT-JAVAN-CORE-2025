import java.util.Scanner;

class Faculty {
    private String name;
    private String date;
    private School x;

    public Faculty() {
        x = new School();
    }

    public Faculty(String name, String date, School x) {
        this.name = name;
        this.date = date;
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên khoa: ");
        name = sc.nextLine();
        System.out.print("Nhập ngày vào khoa: ");
        date = sc.nextLine();
        System.out.println("--- Nhập thông tin trường ---");
        x.input();// gọi hàm nhập của School (nhập thông tin trường)
    }

    public void output() {
        System.out.println("Tên khoa: " + name);
        System.out.println("Ngày vào khoa: " + date);
        System.out.println("--- Thông tin trường ---");
        x.output();// Gọi hàm in của School (in thông tin trường)
    }
}