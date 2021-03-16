import java.util.Scanner;

public class W2_P1_T8 {
    // 表达式求和
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入两个正整数( 如 2 5)：");
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println("和 = " + sum(a, n));
    }

    public static int sum(int a, int n) {
        int SUM = 0;
        for (int i = 1; i <= n; i++) {
            int k = a;
            for (int j = 1; j < i; j++) {
                k = 10 * k + a;
            }
            // System.out.print(k + " ");
            SUM += k;
        }
        return SUM;
    }
}