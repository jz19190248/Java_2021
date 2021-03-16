import java.util.Scanner;

public class W2_P1_T6 {
    // 表达式求和
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();
        print(n);
    }

    public static void print(int n) {
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (float) (1.0 / i);
            i++;
            sum -= (float) (1.0 / i);
        }
        System.out.println("和 = " + sum);
    }
}