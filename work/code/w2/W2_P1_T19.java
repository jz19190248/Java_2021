import java.util.Scanner;

public class W2_P1_T19 {
    // 数组等距输出
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int MAX = 11, step = 0;
        int[] array = new int[MAX];
        System.out.print("请输入十一个整数：");
        for (int i = 0; i < MAX; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("请输入步长：");
        step = scanner.nextInt();
        myPrint(array, MAX, step);
        scanner.close();
    }

    public static void myPrint(int[] array, int MAX, int step) {
        System.out.print("输出序列是： ");
        boolean[] visited = new boolean[MAX];
        for (int i = 0; i < MAX; i++) {
            visited[i] = false;
        }
        int cnt = 0;// 用于统计已输出的个数；
        int i = 0;// 用于作为数组的index
        int step_cnt = 0;// 用于统计是否需要输出
        while (cnt < MAX) {
            if (visited[i] == true) {// 遇到无效的
                i = (i + 1) % MAX;
            } else {
                if (step_cnt < step - 1) {
                    step_cnt++;
                    i = (i + 1) % MAX;
                } else {
                    System.out.print(array[i] + " ");
                    step_cnt = 0;
                    visited[i] = true;
                    cnt++;
                    i = (i + 1) % MAX;
                }
            }

        }
    }

}