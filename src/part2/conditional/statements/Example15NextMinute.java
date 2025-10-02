package part2.conditional.statements;

import java.util.Scanner;

public class Example15NextMinute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int h = sc.nextInt();

        int m= sc.nextInt();
        System.out.println("Thoi gian hien tai: " + h + ":" + (m < 10 ? "0" + m : m));

        m++;
        if (m==60){
            m=0;
            h++;
            if (h==24){
                h=0;
            }
        }
        System.out.println("Thoi gian sau 1 phut: " + h + ":" + (m < 10 ? "0" + m : m));

        sc.close();
    }
}
