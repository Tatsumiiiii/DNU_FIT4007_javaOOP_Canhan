package oop.constructor;

public class Example04Triangle {
    private double sideA;
    private double SideB;
    private double sideC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return SideB;
    }

    public void setSideB(double sideB) {
        SideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Example04Triangle{" +
                "sideA=" + sideA +
                ", SideB=" + SideB +
                ", sideC=" + sideC +
                '}';
    }
}
