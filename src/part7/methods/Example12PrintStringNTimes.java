package part7.methods;

public class Example12PrintStringNTimes {
    public void printStringNTimes(String str,int n){
        if (n<=0){
            System.out.println("N khong hop le");
            return;
        }
        for (int i = 1; i <=n ; i++) {
            System.out.println(str);
        }
    }
}
