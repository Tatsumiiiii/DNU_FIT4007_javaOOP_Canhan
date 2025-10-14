package oop.constructor;

public class Example02Rectangle {
    private double width;
    private double height;

    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight(){
        return height;
    }

    @Override
    public String toString() {
        return "Example02Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
