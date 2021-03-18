import java.util.Scanner;

public class W2_P1_T17 {
    // 最接近的素数
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();
        int MAX = 10000;
        int[] prime = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            prime[i] = 1;
        }
        isPrime(prime);
        solution(n, prime);
        scanner.close();
    }

    public static void solution(int n, int[] prime) {
        boolean flag1 = false, flag2 = false;
        int i = 0, a = 0, b = 0;
        int MAX = 10000;
        while (!flag1 && !flag2) {
            if ((prime[n + i] == 1) && (n + i < MAX)) {
                flag1 = true;
                a = n + i;
            }
            if ((prime[n - i] == 1) && (n - i >= 0)) {
                flag2 = true;
                b = n - i;
            }
            i++;
        }
        if (a != 0 && a == b) {
            System.out.print("最接近的质数是： " + a);
        } else if (a != 0 && b != 0) {
            if (a - n != (n - b)) {
                System.out.print("最接近的质数是 " + (a - n < n - b ? a : b));
            } else {
                System.out.print("最接近的质数是：" + b + "和" + a);
            }
        } else {
            System.out.println("最接近的质数是： " + (a == 0 ? b : a));
        }
    }

    public static void isPrime(int[] prime) {
        prime[1] = 0;
        prime[0] = 0;
        int MAX = 10000;
        for (int i = 2; i < MAX; i++) {
            if (prime[i] == 1) {
                for (int j = 2 * i; j < MAX; j += i) {
                    prime[j] = 0;
                }
            }
        }

    }
}