package Bai2;

import java.util.ArrayList;

public class TestBai2 {
    public static void main(String[] args) {
        ArrayList<Student> ds = new ArrayList<>();
        Student sv1 = new Student("090909", "Bac", 9, 19, "Bac@", "KTPM01", "Nghe An");
        Student sv2 = new Student("090908", "Vinh", 8, 19, "VInh@", "KTPM01", "Nghe An");
        Student sv3 = new Student("090907", "Huy", 7, 19, "Huy@", "KTPM01", "Nghe An");
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        for(Student sv : ds){
            sv.printInfo();
        }
    }
}
