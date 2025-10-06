package part4.loops;
import java.util.Scanner;

public class Example06FindSmallestNWithSumLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();

        if (S <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
        } else {
            int sum = 0;
            int N = 0;

            while (sum + (N + 1) <= S) {
                N++;
                sum += N;
            }

            System.out.println("So nguyen duong N nho nhat sao cho 1 + 2 + ... + N <= " + S + " la: " + N);
            sc.close();
        }
    }
}
