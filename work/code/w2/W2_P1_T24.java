import java.util.*;

public class W2_P1_T24 {
    // 字符串的排列
    public static Stack<Character> stack = new Stack<Character>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.nextLine();
        System.out.println("请输入一个整数：");
        int targ = scanner.nextInt();
        permutation(str.toCharArray(), targ, 0, 0);
        scanner.close();
    }

    // 位运算法1
    public static void permutation(char[] A, int targ, int has, int cur) {
        // A:待排列数
        // targ 选择组合的个数
        // has 当前已有个数
        // cur 已排序的位置

        if (targ == has) {
            System.out.println(stack);
            return;
        }

        for (int i = 0; i < A.length; i++) {
            if (!stack.contains(A[i])) {
                stack.add(A[i]);
                permutation(A, targ, has + 1, i);
                stack.pop();
            }
        }
    }

}