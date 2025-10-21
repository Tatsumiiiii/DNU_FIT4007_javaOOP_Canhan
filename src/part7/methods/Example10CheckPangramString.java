package part7.methods;

public class Example10CheckPangramString {
    public static boolean checkPangramString(String str){
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean letter : alphabet) {
            if (!letter) {
                isPangram = false;
                break;
            }
        }

        return  isPangram;
    }
}
