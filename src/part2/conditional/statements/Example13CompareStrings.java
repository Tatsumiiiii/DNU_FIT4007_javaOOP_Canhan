package part2.conditional.statements;

import java.util.Scanner;
public class Example13CompareStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String a = sc.nextLine();

        String b = sc.nextLine();

        if (a.equals(b)){
            System.out.println("Hai chuoi khac nhau");
        }else {
            System.out.println("Hai chuoi khac nha");
        }

        sc.close();
    }
}
