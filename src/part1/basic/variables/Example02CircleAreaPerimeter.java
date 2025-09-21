package part1.basic.variables;

import java.util.Scanner;

public class Example02CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        float radius = sc.nextFloat();

        double pi = Math.PI;
        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        System.out.printf("Chu vi hình tròn là: %.2f\n", perimeter);
        System.out.printf("Diện tích hình tròn là: %.2f\n", area);
    }
}
