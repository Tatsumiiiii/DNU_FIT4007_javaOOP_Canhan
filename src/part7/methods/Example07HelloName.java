package part7.methods;

import java.util.Scanner;
public class Example07HelloName {
    public static String helloName(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten cua ban:");
        String name=sc.nextLine();

        return "Hello "+name;
    }
}
