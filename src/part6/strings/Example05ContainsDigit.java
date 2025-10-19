package part6.strings;

import java.util.Scanner;
public class Example05ContainsDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String str = sc.nextLine();

       boolean hasDigit=false;

        for (int i = 0; i < str.length()-1; i++) {
            if (Character.isDigit(str.charAt(i))){
                hasDigit= true;
            }
        }
        if (hasDigit){
            System.out.println("Chuoi co so.");
        }else {
            System.out.println("Chuoi khong co so. ");
        }
    }
}
