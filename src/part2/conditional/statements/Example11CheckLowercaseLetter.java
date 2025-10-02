package part2.conditional.statements;

import java.util.Scanner;

public class Example11CheckLowercaseLetter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char ch=sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch+" la chu cai in thuong");
        }else {
            System.out.println(ch+" khong la chu cai in thuong");
        }

        sc.close();
    }
}
