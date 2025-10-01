package part2.conditional.statements;

import java.util.Scanner;

public class Example07CheckTriangleAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && (a + b + c == 180)) {
            System.out.println("Ba goc nay co the la do lon 3 goc cua mot tam giac");
        } else {
            System.out.println("Ba goc nay khong the la do lon 3 goc cua mot tam giac");
        }
        sc.close();
    }
}
