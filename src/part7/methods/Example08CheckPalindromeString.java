package part7.methods;

public class Example08CheckPalindromeString {
    public static boolean checkPalindromeString(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0 ;i--){
            reverse+=str.charAt(i);
        }
        boolean palindrome=true;

        if (!reverse.equals(str)){
            palindrome=false;
        }
        return palindrome;
    }
}
