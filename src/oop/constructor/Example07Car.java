package oop.constructor;

public class Example07Car {
    private String name;
    private String color;
    private int seatCapacity;
    private int year;

    public Example07Car(String name, String color, int seatCapacity, int year) {
        this.name = name;
        this.color = color;
        this.seatCapacity = seatCapacity;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Example07Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", seatCapacity=" + seatCapacity +
                ", year=" + year +
                '}';
    }
}
