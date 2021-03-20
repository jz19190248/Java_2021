import java.util.Scanner;

public class W2_P1_T21 {
    // 最大值的输出
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = 10, x = 0;
        int[] array = new int[MAX];

        System.out.print("请输入十个整数：");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        solution(x, array, N);
        scanner.close();
    }

    public static void solution(int x, int[] array, int N) {

    }

}