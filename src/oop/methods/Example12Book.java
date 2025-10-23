package oop.methods;

import java.util.Scanner;

public class Example12Book {
    private String name;
    private double price;
    private int quantity;

    public Example12Book() {
    }

    public Example12Book(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        name = sc.nextLine();
        System.out.print("Nhập giá sách: ");
        price = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        quantity = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}
