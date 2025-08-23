package Bai1;

import java.util.Scanner;

public class TestBai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap cac ky tu nguyen am: ");
        String input = sc.nextLine();
        for(int i = 0;i<input.length();i++){
            char c = input.charAt(i);
            System.out.print(c+" ");
        }
        System.out.println(" ");
        System.out.println("Ky tu in hoa la: ");
        for(int i = 0; i<input.length();i++){
            char c = input.charAt(i);
            if(Character.isUpperCase(c)){
                System.out.print(c+" ");
            }
        }
    }
}
