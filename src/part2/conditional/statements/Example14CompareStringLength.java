package part2.conditional.statements;

import java.util.Scanner;
public class Example14CompareStringLength {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String a = sc.nextLine();

        String b = sc.nextLine();

        if (a.length()>b.length()){
            System.out.println("Chuoi a dai hon");
        } else if (a.length()==b.length()) {
            System.out.println("Hai chuoi dai bang nhau");
        } else {
            System.out.println("Chuoi b dai hon");
        }

        sc.close();
    }
}
