package oop.methods;

public class Example02Rectangle {
    private double width;
    private double height;

    public Example02Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    @Override
    public String toString() {
        return "Example02Rectangle{width=" + width + ", height=" + height + "}";
    }
}
