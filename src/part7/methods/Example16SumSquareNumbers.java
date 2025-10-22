package part7.methods;

public class Example16SumSquareNumbers {
    public int  sumSquare(int n){
        if (n<0){
            return 0;
        }
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i*i;
        }
        return sum;
    }
}
