package part2.conditional.statements;
import java.util.Scanner;
public class Example02CheckSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int width = scanner.nextInt();

        if (length > 0 && width > 0) {
            if (length == width) {
                System.out.println("Day la hing vuong");
            } else {
                System.out.println("Day khong la hing vuong");
            }
        } else {
            System.out.println("Length and width must be greater than 0.");
        }

        scanner.close();
    }
}
