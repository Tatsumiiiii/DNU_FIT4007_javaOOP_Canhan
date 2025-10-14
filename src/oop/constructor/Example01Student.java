package oop.constructor;

public class Example01Student {
    private String masv;
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMasv(){
        return masv;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Example01Student{" +
                "masv='" + masv + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
