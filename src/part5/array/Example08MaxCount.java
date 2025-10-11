package part5.array;
import java.util.Scanner;
public class Example08MaxCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu:");
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("A[" + i + "] = ");
            a[i]= sc.nextInt();
        }

        int max=a[0];
        for (int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        int count=0;
        for (int i=0;i<n;i++){
            if(a[i]==max){
                count++;
            }
        }
        System.out.println("Phan tu lon nhat:"+max);
        System.out.println("So lan xuat hien:"+count);
        sc.close();
    }
}
