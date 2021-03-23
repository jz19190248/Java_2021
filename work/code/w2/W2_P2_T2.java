import java.util.Scanner;

public class W2_P2_T2 {
    // 递归求最大公约数
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("两个正整数：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("最大公约数=" + gcd(a, b));
        scanner.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else {
            return gcd(b, a % b);
        }
    }
}