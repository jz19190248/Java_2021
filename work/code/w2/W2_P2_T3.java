import java.util.Scanner;

public class W2_P2_T3 {
    // Ackman方法
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("两个正整数：");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println("Ackman(" + m + "," + n + ")=" + Ackman(m, n));
        scanner.close();
    }

    public static int Ackman(int m, int n) {
        if (m == 0 && n > 0)
            return n + 1;
        else if (m > 0 && n == 0) {
            return Ackman(m - 1, 1);
        } else {
            return Ackman(m - 1, Ackman(m, n - 1));
        }
    }
}