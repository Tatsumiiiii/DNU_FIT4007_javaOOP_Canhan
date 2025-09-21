package part1.basic.variables;

import java.util.Scanner;

public class Example07SecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int secondLast = (int) (Math.abs(N / 10) % 10);
        System.out.println(secondLast);
        sc.close();
    }
}
