package part4.loops;

import java.util.Scanner;
public class Example05PrintEvenNumbersToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println("Các số chẵn ≤ " + N + " là:");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
