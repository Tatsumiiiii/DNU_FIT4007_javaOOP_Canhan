package part3.switchcase;
import java.util.Scanner;
public class Example04BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Nhập phép tính (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Không thể chia cho 0!");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println(a + " % " + b + " = " + (a % b));
                } else {
                    System.out.println("Không thể chia lấy dư cho 0!");
                }
                break;
            default:
                System.out.println("Phép tính không hợp lệ!");
        }
    }
}
