import java.util.Scanner;

public class W2_P1_T1 {
    // 等距范围
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入三个正整数（如：3  4  20）：");
        int i = scanner.nextInt();
        int k = scanner.nextInt();
        int j = scanner.nextInt();
        solution(i, j, k);
        scanner.close();
    }

    public static void solution(int i, int j, int k) {
        int sum = 0, a = 0, m = 0;
        while (m <= j) {
            sum += m;
            m = i + a * k;
            a++;
        }
        System.out.println(i + "+" + (i + k) + "+" + "..." + (m - k) + "=" + sum);
    }

}