package part1.basic.variables;

import java.util.Scanner;
public class Example03RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            double length=sc.nextDouble();
            double width= sc.nextDouble();
            if(width>length){
                System.out.println("vui long nhap lai");
            }
            else{
                System.out.println("chu vi la:"+(length+width)*2);
                System.out.println("dien tich la:"+length*width);
                break;
            }
        }

    }
}
