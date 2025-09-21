package part1.basic.variables;

import java.util.Scanner;

public class Example05BirthYearFromAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int your_birth_year= sc.nextInt();
        System.out.println("tuoi cua ban la:"+(2023-your_birth_year));
    }
}
