package part2.conditional.statements;

import java.util.Scanner;

public class Example12CheckUppercaseLetter{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char ch=sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+" la chu cai in hoa");
        }else {
            System.out.println(ch+" khong la chu cai in hoa");
        }

        sc.close();
    }
}
