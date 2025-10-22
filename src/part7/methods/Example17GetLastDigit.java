package part7.methods;

public class Example17GetLastDigit {
    public int lastDigit(int n){
        int lastDigit = (int)(Math.abs(n) % 10);
        return lastDigit;
    }
}
