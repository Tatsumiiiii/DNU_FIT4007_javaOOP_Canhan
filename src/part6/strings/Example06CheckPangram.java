package part6.strings;

import java.util.Scanner;
public class Example06CheckPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

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

        if (isPangram) {
            System.out.println("Chuoi la pangram chua day du 26 chu cai.");
        } else {
            System.out.println("Chuoi KHONG phai la pangram.");
        }
    }
}
