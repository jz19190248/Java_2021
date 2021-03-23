import java.util.Scanner;

public class W2_P1_T23 {
    // 回文字符串判断
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + "是回文数！");
        } else {
            System.out.println(str + "不是回文数！");
        }
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