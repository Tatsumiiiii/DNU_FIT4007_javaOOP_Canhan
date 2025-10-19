package part6.strings;

import java.util.Scanner;
public class Example03CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String str = sc.nextLine();

        String reverse="";

        for (int i=str.length()-1;i>=0 ;i--){
            reverse+=str.charAt(i);
        }
        boolean palindrome=true;

        if (!reverse.equals(str)){
            palindrome=false;
        }

        if (palindrome){
            System.out.println("Chuoi doi xung sau dau nguoc.");
        }else {
            System.out.println("Chuoi khong doi xung sau dau nguoc.");
        }
    }
}
