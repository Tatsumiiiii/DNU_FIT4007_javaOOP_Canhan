package part2.conditional.statements;

import java.util.Scanner;

public class Example05CheckValidScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a score: ");
        int score = sc.nextInt();

        if (score >= 0 && score <= 10) {
            System.out.println(score + " la so hop ly.");
        } else {
            System.out.println(score + " khong la so hop ly.");
        }

        sc.close();
    }
}
