import java.util.Scanner;

public class W2_P3_T4 {

    // 加法拆分方式
    public static int n;
    public static int cont = 1;
    public static int[] x = new int[1000];

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            x[i] = 0;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        n = scanner.nextInt();
        DFS(0, 0, 1);
        scanner.close();
        System.out.println("共计有" + cont + "种加法");
    }

    public static void DFS(int sum, int len, int start) {
        if (n == sum) {
            // 已经累加到n

            // System.out.print(n + "=");
            // for (int j = 0; j < len - 1; j++) {
            // System.out.print(x[j] + "+");
            // }
            // System.out.println(x[len - 1]);
            cont++;
            return;
        }
        for (int i = 1; i < n; i++) {
            if (sum + i <= n && i >= start) {
                x[len] = i;
                len++;
                DFS(sum + i, len, i);
                len--;
            }
        }

    }
}