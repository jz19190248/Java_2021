import java.util.Scanner;

public class W2_P1_T3 {
    // 质数判断

    public static void main(String[] args) {
        int MAX = 10000;
        int[] isPrime = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            isPrime[i] = 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数值：");
        int n = scanner.nextInt();
        solution(isPrime);
        if (isPrime[n] == 1)
            System.out.println("是质数");
        else
            System.out.println("不是质数");
            scanner.close();

    }

    public static void solution(int[] isPrime) {
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