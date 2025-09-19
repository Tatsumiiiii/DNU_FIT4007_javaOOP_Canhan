import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int lastDigit = (int)(Math.abs(N) % 10);
        System.out.println(lastDigit);
        sc.close();
    }
}
