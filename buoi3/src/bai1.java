import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){
        final double p=3.14;
        final String SQUARE = "Square";
        final String TRIANGLE = "Triangle";
        final String CIRCLE = "Circle";

        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao loai hinh(Square, Triangle, Circle):");
        String type = sc.nextLine();

        double s=0;

        if(type.equals(SQUARE)){
            System.out.print("Nhap canh hinh vuong: ");
            double canh=sc.nextDouble();
            s=canh*canh;
            System.out.print("Dien tich hinh vuong la: "+s);
            System.out.println();
        }else if(type.equals(TRIANGLE)){
            System.out.println("Nhap cac canh cua hinh tam giac:");
            System.out.print("Nhap chieu cao: ");
            double chieuCao=sc.nextDouble();
            System.out.print("Nhap day: ");
            double day=sc.nextDouble();
            s=0.5*chieuCao*day;
            System.out.print("Dien tich cua tam giac la: "+ s);
        }else if(type.equals(CIRCLE)){
            System.out.print("Nhap vao ban kich: ");
            double r=sc.nextDouble();
            s=p*r*r;
            System.out.print("Dien tic hinh tron la: "+r);
        }else{
            System.out.print("Khong hop le");
        }
    }
}

