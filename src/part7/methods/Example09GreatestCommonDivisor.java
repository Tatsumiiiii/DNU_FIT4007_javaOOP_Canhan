package part7.methods;

public class Example09GreatestCommonDivisor {
    public static int greatestCommonDivisor(int a,int b){
        if (a <= 0 || b <= 0) {
            return -1;
        }
        int gcd=1;
        for (int i = 1; i <= Math.min(a,b) ; i++) {
            if (a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}
