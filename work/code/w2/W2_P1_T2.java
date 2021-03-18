import java.util.Scanner;

public class W2_P1_T2 {
    // 范围内整数输出
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入三个正整数值（如：5   16   7）：");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        solution(i, j, k);
        scanner.close();
    }

    public static void solution(int i, int j, int k) {
        int a = 1;
        for (int m = i; m <= j; m++) {
            System.out.print(m + "  ");
            a++;
            if (a == 7) {
                System.out.println();
                a = 1;
            }
        }
    }
}