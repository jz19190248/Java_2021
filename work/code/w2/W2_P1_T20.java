import java.util.Scanner;

public class W2_P1_T20 {
    // 多项式求值
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int MAX = 10, x = 0;
        int[] array = new int[MAX + 1];

        System.out.print("请输入十一个整数：");
        for (int i = 0; i < MAX + 1; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("请输入变量x的值：");
        x = scanner.nextInt();
        System.out.print("结果是" + solution(x, array, MAX));
        scanner.close();
    }

    public static int solution(int x, int[] array, int MAX) {
        int sum = array[MAX];
        for (int i = MAX; i > 0; i--) {
            sum = sum * x + array[i - 1];
        }
        return sum;
    }

}