import java.util.Scanner;

public class W2_P1_T12 {
    // 各位数字的平方和
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();
        System.out.print("各位数字的平方和" + solution(n));
    }

    public static int solution(int n) {
        int SUM = 0;
        while (n > 0) {
            SUM += ((n % 10) * (n % 10));
            n /= 10;
        }
        return SUM;
    }
}