package part5.array;
import java.util.Scanner;
public class Example10DivisibleBy5{
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
            if(a[i]%5==0){
                System.out.println(a[i]);
                count++;
            }
        }
        if (count==0){
            System.out.print("Khong ton tai phan tu chia het cho 5");
        }
        sc.close();
    }
}
