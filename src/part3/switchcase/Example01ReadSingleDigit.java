package part3.switchcase;

import java.util.Scanner;
public class Example01ReadSingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 3:
                System.out.println("Ba");
                break;
            case 9:
                System.out.println("Chín");
                break;
            default:
                System.out.println("Khong hop le");
        }
    }
}
