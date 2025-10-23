package oop.methods;

public class Example04Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Example04Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void set(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public boolean isIsoscelesTriangle() {
        return sideA == sideB || sideA == sideC || sideB == sideC;
    }

    public boolean isEquilateralTriangle() {
        return sideA == sideB && sideB == sideC;
    }

    public boolean isRightTriangle() {
        double a2 = sideA * sideA;
        double b2 = sideB * sideB;
        double c2 = sideC * sideC;
        return a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2;
    }

    @Override
    public String toString() {
        return "Example04Triangle{sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "}";
    }
}
