package part6.strings;

import java.util.Scanner;
public class Example04CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String[] parts = sc.nextLine().split(" ");

        System.out.println("So tu trong chuoi la:"+parts.length);
    }
}
