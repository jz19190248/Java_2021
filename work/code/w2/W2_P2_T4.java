import java.util.Scanner;

public class W2_P2_T4 {
    // 倒序数
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("一个整数：");
        int m = scanner.nextInt();
        System.out.println("倒序数为： " + fun(m, 0));
        scanner.close();
    }

    public static int fun(int m, int n) {
        if (m == 0)
            return n;
        else {
            return fun(m / 10, n * 10 + m % 10);
        }
    }
}