import java.util.Scanner;

public class W2_P1_T18 {
    // 数组的转置
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int MAX = 8;
        int[] array = { 10, 11, 12, 13, 14, 15, 16, 17 };
        System.out.print("数组翻转前：");
        for (int i = 0; i < MAX; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        reverse(array, MAX);
        System.out.print("数组翻转后：");
        for (int i = 0; i < MAX; i++) {
            System.out.print(array[i] + "  ");
        }
        scanner.close();
    }

    public static void reverse(int[] array, int MAX) {
        int i = 0;
        for (i = 0; i <= MAX / 2; i++) {
            int temp = array[i];
            array[i] = array[MAX - i - 1];
            array[MAX - i - 1] = temp;
        }
    }

}