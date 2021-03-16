import java.util.Scanner;

public class W2_P1_T4 {
    public static void main(String[] args) {
        int MAX = 10000;
        int[] isPrime = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            isPrime[i] = 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入三个正整数值（如：5   18   3）");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        prime(isPrime);
        print(isPrime, i, j, k);
    }

    public static void print(int[] isPrime, int i, int j, int k) {
        int b = 0;
        for (int a = i - 1; a < j; a++) {
            if (isPrime[a] == 1) {
                System.out.print(a + "  ");
                b++;
            }
            if (b == k) {
                System.out.println();
                b = 0;
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