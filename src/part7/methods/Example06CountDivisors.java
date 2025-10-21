package part7.methods;

public class Example06CountDivisors {
    public static int countDivivors(int n){
        if (n<=0){
            return -1;
        }
        int count=0;
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                count++;
            }
        }
        return count;
    }
}
