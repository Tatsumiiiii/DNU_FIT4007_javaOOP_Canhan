package part2.conditional.statements;

import java.util.Scanner;
public class Example04FindMaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float maxNum;
        float a=sc.nextFloat();
        float b=sc.nextFloat();

        if(a>b){
            maxNum=a;
        }else {
            maxNum=b;
        }
        System.out.println("So lon hon la:"+maxNum);
        sc.close();
    }
}