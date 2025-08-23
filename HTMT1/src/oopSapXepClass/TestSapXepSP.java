package oopSapXepClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestSapXepSP {
    public static void main(String[] args) {
       //tao List
       ArrayList<SanPham> ds=new ArrayList<>();
       //khoi tao cac doi tuong san pham
        SanPham sp1 = new SanPham(1,"SamSung",1050);
        SanPham sp2 = new SanPham(2,"Iphone",1080);
        SanPham sp3 = new SanPham(3,"Sony",1070);
        //add san pham vao list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        //xem danh sach trong list
        for(SanPham sp : ds){
            System.out.println(sp);
        }

        //goi phuong thuc sap xep
        Collections.sort(ds);
        System.out.println("Danh sach sau sap xep la: ");
        for(SanPham sp : ds){
            System.out.println(sp);
        }
    }
}
