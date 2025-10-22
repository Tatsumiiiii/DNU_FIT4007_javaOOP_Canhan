package part7.methods;

public class Example13TriangleArea {
    public static double triangleArea(double a, double b, double c) {
        if(a+c<=b||a+b<=c||b+c<=a){
            return -1;
        }
        double p=(a+b+c)/2;
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
}
