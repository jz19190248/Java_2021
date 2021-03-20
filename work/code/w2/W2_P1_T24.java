import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class W2_P1_T24 {
    // 字符串的排列
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.nextLine();
        str = scanner.nextLine();

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        char[] ch = str.toCharArray();
        int length = str.length();

        for (int i = 0; i <= length / 2; i++) {
            // System.out.println(ch[i] + " " + ch[length - 1 - i]);
            if (ch[i] != ch[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}