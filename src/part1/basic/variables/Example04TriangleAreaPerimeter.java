package part1.basic.variables;

import java.util.Scanner;

public class Example04TriangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double side1= sc.nextDouble();
        double side2= sc.nextDouble();
        double side3= sc.nextDouble();
        double halfpete=(side1+side2+side3)/2;
        double area=Math.sqrt(halfpete*(halfpete-side1)*(halfpete-side2)*(halfpete-side3));
        System.out.print("dien tich triangle la:"+area);
    }
}
