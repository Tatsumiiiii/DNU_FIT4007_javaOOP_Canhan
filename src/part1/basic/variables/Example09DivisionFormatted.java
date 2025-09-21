package part1.basic.variables;

import java.util.Scanner;

public class Example09DivisionFormatted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((float) a / b);
    }
}