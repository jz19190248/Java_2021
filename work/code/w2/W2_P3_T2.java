import java.util.Scanner;
import java.util.Stack;

public class W2_P3_T2 {

    // 大数相乘
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入两个整数：");
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        System.out.print("大数相加结果：" + num1 + "+" + num2 + "=");
        for (int i = 0; i < bigNumberAdd(num1.toCharArray(), num2.toCharArray()).length; i++) {
            System.out.print(bigNumberAdd(num1.toCharArray(), num2.toCharArray())[i]);
        }
        System.out.println();

        System.out.print("大数相乘结果：" + num1 + "+" + num2 + "=" + bigNumberMul(num1, num2));

        scanner.close();
    }

    public static int[] bigNumberAdd(char[] A, char[] B) {
        Stack<Integer> stackA = new Stack<Integer>();
        Stack<Integer> stackB = new Stack<Integer>();
        Stack<Integer> stackNum = new Stack<Integer>();

        int len = Math.max(A.length, B.length) + 1;
        int[] reslut = new int[len - 1];

        for (int i = 0; i < A.length; i++) {
            stackA.push((int) A[i] - 48);
        }
        for (int i = 0; i < B.length; i++) {
            stackB.push((int) B[i] - 48);
        }

        int cin = 0;
        while (!stackA.empty() && !stackB.empty()) {
            int temp = stackA.pop() + stackB.pop() + cin;
            if (temp >= 10) {
                cin = 1;
            } else {
                cin = 0;
            }
            stackNum.push(temp % 10);
        }

        while (!stackA.empty()) {
            int temp = stackA.pop() + cin;
            if (temp >= 10) {
                cin = 1;
            } else {
                cin = 0;
            }
            stackNum.push(temp % 10);
        }

        while (!stackB.empty()) {
            int temp = stackB.pop() + cin;
            if (temp >= 10) {
                cin = 1;
            } else {
                cin = 0;
            }
            stackNum.push(temp % 10);
        }

        int i = 0;
        while (!stackNum.empty()) {
            reslut[i++] = stackNum.pop();
        }
        return reslut;
    }

    public static String bigNumberMul(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray();
        if ((num1.length() == 1 && num1.equals("0")) || (num2.length() == 1 && num2.equals("0")))
            return "0";
        // 两数相乘最大不会超过两位相加的位数
        int[] result = new int[a.length + b.length];
        // 两数倒向相乘
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = b.length - 1; j >= 0; j--) {
                result[a.length - 1 - i + b.length - 1 - j] += (a[i] - 48) * (b[j] - 48);
            }
        }
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] >= 10) {
                result[i + 1] += result[i] / 10;
                result[i] = result[i] % 10;
            }
        }
        // 从前向后判断是否可以读取也就是第一位是不是为零
        boolean juge = false;
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] != 0) {
                juge = true;
            }
            if (juge) {
                res.append(result[i]);
            }
        }
        return res.toString();
    }
}