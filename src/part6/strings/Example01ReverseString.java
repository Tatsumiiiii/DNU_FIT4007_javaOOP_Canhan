package part6.strings;

import java.util.Scanner;
public class Example01ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can dao ngươc:");
        String str = sc.nextLine();

        String reverse="";

        for (int i=str.length()-1;i>=0 ;i--){
            reverse+=str.charAt(i);
        }

        System.out.println("Chuoi sau dao nguoc la:"+reverse);
    }
}
