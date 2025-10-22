package part7.methods;

public class Example18GetFirstDigit {
    public static int firstDigit(int n) {
        n = Math.abs(n);

        while (n >= 10) {
            n = n / 10;
        }

        return n;
    }
}
