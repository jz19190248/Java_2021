import java.util.Scanner;

public class W2_P2_T1 {
    // 递归求和
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("一个正整数：");
        int n = scanner.nextInt();
        System.out.println("和=" + s(n));
        scanner.close();
    }

    public static int s(int n) {
        if (n == 0)
            return 0;
        else {
            return s(n - 1) + n;
        }
    }
}