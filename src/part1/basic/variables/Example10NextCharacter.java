package part1.basic.variables;
import java.util.Scanner;

public class Example10NextCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập 1 ký tự thường (a-y): ");
        char ch = sc.next().charAt(0);

        char nextChar = (char)(ch + 1);

        System.out.println("Ký tự liền sau là: " + nextChar);
    }
}
