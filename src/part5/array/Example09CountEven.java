package part5.array;
import java.util.Scanner;
public class Example09CountEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu:");
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("A[" + i + "] = ");
            a[i]= sc.nextInt();
        }

        int count=0;
        for (int i=0;i<n;i++){
            if(a[i]%2==0){
                count++;
            }
        }

        System.out.println("So chan trong mang la:"+count);
        sc.close();
    }
}
