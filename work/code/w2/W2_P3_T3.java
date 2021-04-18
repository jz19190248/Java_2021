import java.util.*;

public class W2_P3_T3 {

    // 木棍搭三角形
    private final static int N = 4;

    public static void main(String[] args) {
        ArrayList<Integer> L = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入" + N + "个整数：");
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());
        }
        maxTriangle(L);
        scanner.close();
    }

    public static void maxTriangle(ArrayList<Integer> L) {
        L.sort(Comparator.naturalOrder());
        // natural 自然排序 升序
        // reverse 降序
        for (int i = N - 1; i > 2; i--) {
            if (L.get(i) < L.get(i - 1) + L.get(i - 2)) {
                System.out.println(L.get(i) + " " + L.get(i - 1) + " " + L.get(i - 2));
                return;
            }

        }
        System.out.println("无法构成三角形");
        return;
    }
}