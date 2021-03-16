import java.util.Scanner;

public class W2_P1_T7 {
    // fibonacci
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}