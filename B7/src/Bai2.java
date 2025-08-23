public class Bai2 {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Lao hac", "Nam Cao");
        books[1] = new Book("Vo Nhat","Ngo Tat To");
        books[2] = new Book("Tat Den","Ngo Tat To");

        System.out.println("Thong tin cac quyen sach la: ");
        for(int i =0;i<books.length;i++){
            books[i].hienThiThongTin();
        }

        Student[] students = new Student[2];
        students[0] = new Student(2323, "Bac", "Nghe An");
        students[1] = new Student(2334, "Vinh", "Yen Thanh");
        System.out.println("Thong tin sinh vien la: ");
        for(int i = 0;i < students.length; i++){
            students[i].printInfo();
        }
    }
}
