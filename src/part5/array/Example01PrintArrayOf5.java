package part5.array;
import java.util.Scanner;
public class Example01PrintArrayOf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[5];
        for (int i=0;i<5;i++){
            System.out.print("A[" + i + "] = ");
            a[i]= sc.nextInt();
        }
        System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
        sc.close();
    }
}
