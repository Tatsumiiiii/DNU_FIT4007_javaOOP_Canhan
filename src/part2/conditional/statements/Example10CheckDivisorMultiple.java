package part2.conditional.statements;

import java.util.Scanner;
public class Example10CheckDivisorMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            if (a % b == 0 && b % c == 0) {
                System.out.println("b dong thoi la uoc cua a va la boi cua c.");
            } else {
                System.out.println("b khong thoa man dieu kien.");
            }
        } else {
            System.out.println("Tat ca cac so phai la so nguyen duong.");
        }
        sc.close();
    }
}
