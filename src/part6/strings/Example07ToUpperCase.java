package part6.strings;

import java.util.Scanner;
public class Example07ToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String str = sc.nextLine().toUpperCase();

        System.out.println("Chuoi sau in hoa la:"+str);
    }
}
