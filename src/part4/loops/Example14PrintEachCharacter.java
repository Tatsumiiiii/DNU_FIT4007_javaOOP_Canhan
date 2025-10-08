package part4.loops;

import java.util.Scanner;

public class  Example14PrintEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Cac ky tu trong ten cua ban la:");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}