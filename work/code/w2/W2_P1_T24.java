import java.util.*;

public class W2_P1_T24 {
    // 字符串的排列
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.nextLine();
        permute(str);
        scanner.close();
    }

    public static void permute(String str) {
        char[] ch = str.toCharArray();
        int n = str.length();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(ch[i]);
        }
        List<List<Character>> ans = new ArrayList<>();
        backtrack(n, ans, list, 0);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + "  ");
            }
            System.out.println("aaaaaaaaaaaaaaaa");
        }
    }

    public static void backtrack(int n, List<List<Character>> ans, List<Character> list, int first) {
        if (first == n) {
            ans.add(new ArrayList<>());
        }
        for (int i = first; i < n; i++) {
            Collections.swap(list, first, i);// 添加新的访问数
            backtrack(n, ans, list, first + 1);// 递归访问
            Collections.swap(list, first, i);// 回溯
        }
    }
}