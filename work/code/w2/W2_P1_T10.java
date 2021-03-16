import java.util.Scanner;

public class W2_P1_T10 {
    // 成绩分流
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数（0-100）：");
        int n = scanner.nextInt();
        solution(n);
    }

    public static void solution(int n) {
        switch (n / 10) {
        case 10:
            System.out.println("*****");
            break;
        case 9:
            System.out.println("*****");
            break;
        case 8:
            System.out.println("****");
            break;
        case 7:
            System.out.println("***");
            break;
        case 6:
            System.out.println("**");
            break;
        default:
            System.out.println("*");
            break;
        }
    }
}