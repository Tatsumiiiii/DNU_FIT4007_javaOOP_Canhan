package part7.methods;

public class Example14DecimalToBinary {
    public String binary(int n){
        if (n==0){
            return "0";
        }
        String result="";
        while (n>0){
            result=(n%2)+result;
            n=n/2;
        }
        return result;
    }
}
