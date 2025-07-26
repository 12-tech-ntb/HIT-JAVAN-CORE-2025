import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println(input.toUpperCase());
            System.out.println("Chuỗi này đối xứng.");
        } else {
            System.out.println(input.toLowerCase());
            System.out.println("Chuỗi này không đối xứng.");
        }

    }
}
