import java.util.Scanner;

public class W2_P3_T2 {

    // 大数相乘
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");

        scanner.close();
    }

    public static char[] ByCirculation(char[] A, char[] B) {
        int len = A.length > B.length ? A.length : B.length;
        char[] reslut = new char[len + 1];
        int i = 0;
        int cin = 0;
        while (i < A.length && i < B.length) {
            if (A[i] + B[i] + cin < 10) {
                cin = 0;
            } else {
                cin = 1;
            }
            reslut[i] = (A[i] + B[i] + cin) % 10;
        }
        while (i < A.length) {

        }
        return reslut;
    }

}