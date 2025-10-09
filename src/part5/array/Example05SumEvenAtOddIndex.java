package part5.array;
import java.util.Scanner;
public class Example05SumEvenAtOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int sum=0;

        for (int i=0;i<n;i++){
            System.out.print("A[" + i + "] = ");
            a[i]= sc.nextInt();
            if(i%2!=0&&a[i]%2==0){
                sum+=a[i];
            }
        }

        System.out.println("Tong cac so chan mang chi so le cua mang la:"+sum);
        sc.close();
    }
}
