package part6.strings;

import java.util.Scanner;
public class Example02CountCharA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String str = sc.nextLine();

        int count=0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("So lan xuat hien 'a' trong chuoi la:"+count);
    }
}
