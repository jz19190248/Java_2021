import java.util.Scanner;

public class W2_P1_T18 {
    // 数组的转置
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();
        int MAX = 8;
        int[] array = { 10, 11, 12, 13, 14, 15, 16, 17 };
        System.out.println(findIndex(n, array, MAX));
        scanner.close();
    }

    public static int findIndex(int n, int[] array, int MAX) {
        int i = 0;
        while (i < MAX) {
            if (array[i] == n) {
                return i;
            }
            i++;
        }
        return -1;
    }

}