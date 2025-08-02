//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bai1 {
    public static void main(String[] args) {
        Student sv1 = new Student("Bac",2006,"Nghe An",7.5,8,9,0);
        Student sv2 = new Student("Phuc",2006,"Nghe An",7.8,8,9,1);
        Student sv3 = new Student("Hieu",2006,"Ha Noi",7,8,6,0);
        Student sv4 = new Student("Vinh",2006,"Nghe An",7,8,6,2);
        Student sv5 = new Student("Huy",2006,"Nghe An",7,6,8,0);
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        sv3.hienThiThongTin();
        sv4.hienThiThongTin();
        sv5.hienThiThongTin();
    }
}