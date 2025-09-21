package part1.basic.variables;

import java.util.Scanner;

public class Example08NameLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int leng_Name=name.length();
        System.out.println(leng_Name);
    }
}
