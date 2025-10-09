package part5.array;
import java.util.Scanner;
public class Example03ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("A[" + i + "] = ");
            a[i]= sc.nextInt();
        }

        System.out.println("Mảng vừa nhập là:");
        for (int i = n-1; i > -1; i--){
            System.out.print(a[i] + " ");

        }
        sc.close();
    }
}
