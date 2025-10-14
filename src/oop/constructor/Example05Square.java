package oop.constructor;

public class Example05Square {
    private double side;

    public double getSide(){
        return  side;
    }
    public void setSide(double side){
        this.side=side;
    }

    @Override
    public String toString(){
        return "Example05Square{"+
                "side="+side+'}';
    }
}
