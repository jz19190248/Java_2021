import java.util.Scanner;

public class W2_P1_T9 {
    // 完全数输出
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入两个正整数( 如 1 1000)：");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        solution(i, j);
        scanner.close();
    }

    public static void solution(int i, int j) {
        for (int k = i; k <= j; k++) {
            int sum = 0;
            for (int a = 1; a < k; a++) {
                if (k % a == 0)
                    sum += a;
            }
            if (sum == k)
                System.out.print(k + "  ");
        }
    }
}