package part2.conditional.statements;
import java.util.Scanner;

public class Example01CheckNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên N: ");
        int N = scanner.nextInt();

        if (N >= 0) {
            System.out.println(N + " là số tự nhiên.");
        } else {
            System.out.println(N + " không phải là số tự nhiên.");
        }
        scanner.close();
    }
}
