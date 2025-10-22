package part7.methods;

public class Example20CountTrailingZeros {
    public static int countTrailingZeros(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
