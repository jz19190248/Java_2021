import java.util.Scanner;

public class W2_P1_T11 {
    // 阶乘之和
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();
        System.out.println(solution(n));
        scanner.close();
    }

    public static int solution(int n) {
        int SUM = 1, fac = 1;
        if (n % 2 == 0)
            n = n - 1;
        for (int i = 3; i <= n; i = i + 2) {
            fac *= (i - 1);
            // System.out.print(fac + " ");
            fac *= i;
            // System.out.println(fac);
            SUM += fac;
        }
        return SUM;
    }
}