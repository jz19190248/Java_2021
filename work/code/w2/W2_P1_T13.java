import java.util.Scanner;

public class W2_P1_T13 {
    // 逆序数的值的输出
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();
        System.out.print("逆序数：" + solution(n));
    }

    public static int solution(int n) {
        int x = 0;
        while (n > 0) {
            x = x * 10 + n % 10;
            n /= 10;
        }
        return x;
    }
}