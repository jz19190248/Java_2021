import java.util.Scanner;

public class W2_P1_T14 {
    // 同构数的输出
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入两个正整数(如 1 1000)：");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println("同构数：");
        solution(i, j);
        scanner.close();
    }

    public static void solution(int i, int j) {
        for (int a = i; a <= j; a++) {
            int mod = 1;
            while (mod < a) {
                mod *= 10;
            } // temp == 9999,mod == 10000;temp ==100,mod ==1000
            int cnt = 1;// 这个变量用于控制行号输出；
            if (a == (a * a) % mod) {
                System.out.print("(" + a + "," + a * a + ")  ");
                cnt++;
            }
            if (cnt == 10) {
                System.out.println();
                cnt = 1;
            }
        }

    }
}