import java.util.Scanner;

public class W2_P1_T5 {
    // 前n个质数输出
    public static void main(String[] args) {
        int MAX = 10000;
        int[] isPrime = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            isPrime[i] = 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入两个正整数值（如：8   3）：");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        prime(isPrime);
        print(isPrime, n, k);
    }

    public static void print(int[] isPrime, int n, int k) {
        int cnt = 0, i = 0;
        while (cnt <= n) {
            if (isPrime[i] == 1) {
                System.out.print(i + " ");
                i++;
                cnt++;
                if (cnt % k == 0) {
                    System.out.println();
                }

            } else {
                i++;
            }
        }
    }

    public static void prime(int[] isPrime) {
        isPrime[0] = 0;
        isPrime[1] = 0;
        int MAX = 10000;
        for (int i = 2; i < MAX; i++) {
            if (isPrime[i] == 1) {
                for (int j = 2 * i; j < MAX; j += i) {
                    isPrime[j] = 0;
                }
            }
        }
    }
}