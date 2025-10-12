package part5.array;
import java.util.Scanner;
public class Example13CheckNonDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu:");
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("A[" + i + "] = ");
            a[i]= sc.nextInt();
        }
        boolean isNotDecrease=true;
        for (int i=0;i<n-1;i++){
            if (a[i] > a[i+1]) {
                isNotDecrease = false;
                break;
            }
        }
        if (isNotDecrease) {
            System.out.println("Mang khong giam.");
        } else {
            System.out.println("Mang giam.");
        }
        sc.close();
    }
}
