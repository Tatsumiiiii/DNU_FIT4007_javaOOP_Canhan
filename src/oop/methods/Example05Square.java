package oop.methods;

public class Example05Square {
    private double side;

    public Example05Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public boolean isIntegerSquareSide() {
        return side == (int) side;
    }

    @Override
    public String toString() {
        return "Example05Square{side=" + side + "}";
    }
}
