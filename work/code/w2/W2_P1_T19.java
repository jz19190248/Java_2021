import java.util.Scanner;

public class W2_P1_T19 {
    // 数组等距输出
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int MAX = 10, step = 0;
        int[] array = new int[MAX];
        System.out.print("请输入十个整数：");
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
        int cnt = 0;
        boolean[] visited = new boolean[MAX];
        for (int j = 0; j < MAX; j++) {
            visited[j] = false;
        }
        int i = 0;
        while (cnt < MAX) {
            if (visited[i] == false) {

            }
        }
    }

}