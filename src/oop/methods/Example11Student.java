package oop.methods;

import java.util.Scanner;

public class Example11Student {
    private String masv;
    private String name;
    private int age;

    public Example11Student() {
    }

    public Example11Student(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        masv = sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        age = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Example11Student{masv='" + masv + "', name='" + name + "', age=" + age + "}";
    }
}
