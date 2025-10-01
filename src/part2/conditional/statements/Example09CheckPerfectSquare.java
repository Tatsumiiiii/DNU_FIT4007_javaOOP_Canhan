package part2.conditional.statements;
import java.util.Scanner;

public class Example09CheckPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N > 0) {
            double sqrtN = Math.sqrt(N);
            int intPart = (int) sqrtN;


            if (sqrtN == intPart) {
                System.out.println(N + " la so chinh phuong.");
            } else {
                System.out.println(N + " khong phai la so chinh phuong.");
            }
        } else {
            System.out.println("N phai la so nguyen duong.");
        }

        sc.close();
    }
}
