package part7.methods;

public class Example15SumArray {
    public int sumArray(int[]arr){
       int total=0;
        for (int x:arr) {
            total+=x;
        }
        return total;
    }
}
