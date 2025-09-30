package part2.conditional.statements;

import java.util.Scanner;
public class Example03CheckEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a= scanner.nextInt();

        if(a%2==0){
            System.out.println("Day la so chan");
        }else {
            System.out.println("Day khong la so chan");
        }
        scanner.close();
    }
}