package part5.array;
import java.util.Scanner;
public class Example12DeleteAtIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu:");
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("A[" + i + "] = ");
            a[i]= sc.nextInt();
        }
        System.out.print("Nhap k (0 <= k < N): ");
        int k = sc.nextInt();

        int[] b = new int[n - 1];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i != k) {
                b[j] = a[i];
                j++;
            }
        }
        System.out.println("Mang sau khi xoa phan tu chi so " + k + ":");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();
    }
}
