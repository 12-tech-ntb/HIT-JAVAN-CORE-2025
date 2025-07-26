import java.util.Random;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);


        int a = rand.nextInt(101);
        int b = rand.nextInt(101);


        boolean isCorrect = rand.nextBoolean();


        int c;
        if (isCorrect) {
            c = a + b;
        } else {

            do {
                c = rand.nextInt(201);
            } while (c == a + b);
        }


        System.out.println("Phép toán của bạn là:");
        System.out.println(a + " + " + b + " = " + c);

        System.out.print("Dự đoán kết quả của phép toán (dung/sai): ");
        String input = sc.nextLine().toLowerCase();

        boolean userAnswer = input.equals("dung");

        if (userAnswer == isCorrect) {
            System.out.println("Bạn đã trả lời đúng!");
        } else {
            System.out.println("Bạn đã trả lời sai!");
        }

        sc.close();
    }
}

