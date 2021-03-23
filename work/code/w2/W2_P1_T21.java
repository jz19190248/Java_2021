import java.util.Scanner;

public class W2_P1_T21 {
    // 最大值的输出
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = 10;
        int[] array = new int[N];

        System.out.print("请输入十个整数：");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        maxPrint(array, N);
        scanner.close();
    }

    public static void maxPrint(int[] array, int N) {
        int[] location = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + "_" + location[i] + "  ");
        }
        System.out.println();
        int i = 0;
        int cnt = 1;
        while (true) {
            if (i == N - 1) {
                System.out.print(array[i] + "出现次数：" + cnt + " 次，位置在：  ");
                for (int j = i - cnt + 1; j <= i; j++) {
                    System.out.print(location[j]);
                }
                System.out.println();
                break;
            }
            if (array[i] == array[i + 1]) {
                cnt++;
            } else {
                System.out.print(array[i] + "出现次数：" + cnt + " 次，位置在：  ");
                for (int j = i - cnt + 1; j <= i; j++) {
                    System.out.print(location[j] + " ");
                }
                System.out.println();
                cnt = 1;
            }
            i++;
        }
    }

}