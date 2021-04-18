import java.util.Scanner;

public class W2_P4_T1 {

    // 轮流取球问题

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入箱子中的小球数：");
        int n = scanner.nextInt();
        if (getBall(n))
            System.out.println("A赢");
        else
            System.out.println("A输");
        scanner.close();
    }

    public static boolean getBall(int residue) {
        if (residue >= 1) {
            switch (residue) {
            case 1:
                return false;
            case 3:
                return false;
            case 7:
                return false;
            case 8:
                return true;
            // 不是以上情况，则A取出1357后交给B，B将对应的结果取反
            default:
                return (!getBall(residue - 1) || !(getBall(residue - 3)) || !(getBall(residue - 8))
                        || !getBall(residue - 7));
            }
        } else {
            return false;
        }

    }

}