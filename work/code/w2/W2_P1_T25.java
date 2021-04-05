import java.util.*;

public class W2_P1_T25 {
    // 字符串的组合
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.nextLine();
        System.out.println("请输入一个整数：");
        int M = scanner.nextInt();
        int N = str.length();
        combination1(str.toCharArray(), N, M);

        scanner.close();
    }

    public static int Count1(int n)// 求一个数字中1的个数
    {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    // 位运算法1
    public static void combination1(char[] A, int N, int M) {
        int nbit = 1 << N;
        int count = 0;
        for (int i = 0; i < nbit; i++) {// 总共有2的N次方中全组合
            if (Count1(i) == M) {// 取出M个数
                for (int j = 0; j < N; j++) {
                    int temp = 1 << j;
                    if ((temp & i) != 0) {
                        System.out.print(A[j]);
                    }
                }
                System.out.println();
                count++;
            }
        }
        System.out.println("共计" + count + "种组合方式如上");
    }
}