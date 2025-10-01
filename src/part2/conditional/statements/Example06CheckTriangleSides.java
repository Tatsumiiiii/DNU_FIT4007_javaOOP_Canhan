package part2.conditional.statements;

import java.util.Scanner;

public class Example06CheckTriangleSides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Ba số trên có thể là 3 cạnh của một tam giác.");
            } else {
                System.out.println("Ba số trên không thể là 3 cạnh của một tam giác.");
            }
        } else {
            System.out.println("Các cạnh phải lớn hơn 0.");
        }

        sc.close();
    }
}
