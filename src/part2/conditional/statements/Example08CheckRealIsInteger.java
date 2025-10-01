package part2.conditional.statements;
import java.util.Scanner;

public class Example08CheckRealIsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao mot so thuc: ");
        float number = sc.nextFloat();

        // ep kieu ve so nguyen
        int intPart = (int) number;

        if (number == intPart) {
            System.out.println(number + " la so nguyen.");
        } else {
            System.out.println(number + " khong phai la so nguyen.");
        }

        sc.close();
    }
}
