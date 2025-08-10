import java.util.Scanner;


class School {
    private String name;
    private String date;

    public School() {
    }

    public School(String name, String date) {
        this.name = name;
        this.date = date;
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

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên trường: ");
        name = sc.nextLine();
        System.out.print("Nhập ngày vào trường: ");
        date = sc.nextLine();
    }

    public void output() {
        System.out.println("Tên trường: " + name);
        System.out.println("Ngày vào trường: " + date);
    }
}
