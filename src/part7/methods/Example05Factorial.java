package part7.methods;

public class Example05Factorial {
    public static long factorial(int n){
        long result=1;
        if (n<0){
            return -1;
        }
        for (int i = 1; i <= n; i++) {
            result*=i;
        }
        return result;
    }
}
