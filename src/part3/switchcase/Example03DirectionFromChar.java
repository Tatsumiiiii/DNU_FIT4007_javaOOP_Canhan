package part3.switchcase;

import java.util.Scanner;
public class Example03DirectionFromChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ký tự (N/E/W/S): ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'N':
                System.out.println("Hướng Bắc");
                break;
            case 'S':
                System.out.println("Hướng Nam");
                break;
            case 'E':
                System.out.println("Hướng Tây");
                break;
            case 'W':
                System.out.println("Hướng Đông");
                break;
            default:
                System.out.println("Ký tự không hợp lệ!");
        }
    }
}
