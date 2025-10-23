package oop.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Example13BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách N: ");
        int n = sc.nextInt();
        sc.nextLine();

        Example12Book[] books = new Example12Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin sách thứ " + (i + 1) + ":");
            books[i] = new Example12Book();
            books[i].input();
        }

        System.out.println("\n--- DANH SÁCH SÁCH VỪA NHẬP ---");
        for (Example12Book b : books) {
            System.out.println(b);
        }

        double maxPrice = books[0].getPrice();
        for (Example12Book b : books) {
            if (b.getPrice() > maxPrice) {
                maxPrice = b.getPrice();
            }
        }

        System.out.println("\n--- SÁCH CÓ GIÁ CAO NHẤT ---");
        for (Example12Book b : books) {
            if (b.getPrice() == maxPrice) {
                System.out.println(b);
            }
        }

        System.out.println("\n--- SÁCH CÓ TÊN 'Java OOP' ---");
        boolean found = false;
        for (Example12Book b : books) {
            if (b.getName().equalsIgnoreCase("Java OOP")) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có sách tên 'Java OOP'.");
        }

        Arrays.sort(books, Comparator.comparingInt(Example12Book::getQuantity));
        System.out.println("\n--- SẮP XẾP TĂNG DẦN THEO QUANTITY ---");
        for (Example12Book b : books) {
            System.out.println(b);
        }

        Arrays.sort(books, (b1, b2) -> Double.compare(b2.getPrice(), b1.getPrice()));
        System.out.println("\n--- SẮP XẾP GIẢM DẦN THEO PRICE ---");
        for (Example12Book b : books) {
            System.out.println(b);
        }
    }
}
