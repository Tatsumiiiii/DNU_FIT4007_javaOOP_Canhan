package part5.array;
import java.util.Scanner;
public class Example06FirstLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu:");
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("A[" + i + "] = ");
            a[i]= sc.nextInt();
        }

        System.out.print("Phan tu dau va phan tu cuoi la:"+a[0]+","+a[n-1]);

        sc.close();
    }
}
