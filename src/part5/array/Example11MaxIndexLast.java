package part5.array;
import java.util.Scanner;
public class Example11MaxIndexLast{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu:");
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("A[" + i + "] = ");
            a[i]= sc.nextInt();
        }
        int index=0;
        int max=a[0];
        for (int i=0;i<n;i++){
            if(a[i]>=max){
                max=a[i];
                index=i;
            }
        }
        System.out.println("Phan tu lon nhat:"+max);
        System.out.println("Chi so cua phan tu lon nhat:"+index);
        sc.close();
    }
}
