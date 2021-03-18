import java.util.Scanner;

public class W2_P1_T15 {
    // 输出第k位数的值
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入两个正整数()：");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        solution(n, k);
        scanner.close();
    }

    public static void solution(int n, int k) {
        for (int i = 1; i < k; i++) {
            n /= 10;
        }
        System.out.print(n % 10);
    }
}