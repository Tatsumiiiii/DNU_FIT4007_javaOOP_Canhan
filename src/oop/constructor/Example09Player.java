package oop.constructor;

public class Example09Player {
    private String name;;
    private int age;
    private int positionX;
    private int PositionY;

    public Example09Player(String name, int age, int positionX, int positionY) {
        this.name = name;
        this.age = age;
        this.positionX = positionX;
        PositionY = positionY;
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

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public void setPositionY(int positionY) {
        PositionY = positionY;
    }

    @Override
    public String toString() {
        return "Example09Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", positionX=" + positionX +
                ", PositionY=" + PositionY +
                '}';
    }
}
