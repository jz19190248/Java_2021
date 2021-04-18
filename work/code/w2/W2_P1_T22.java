import java.util.*;

public class W2_P1_T22 {
    // 句子中的字符统计

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("请输入一个句子：");
        str = scanner.nextLine();
        wordcount(str);
        scanner.close();
    }

    public static void wordcount(String str) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {

            if (map.get(str.charAt(i)) == null) {
                // map.put()将键值存储在map集合中，如果存在，那么就覆盖该键值，如果不存在就新建一个。
                map.put(str.charAt(i), 1);
            } else {
                int frequency = map.get(str.charAt(i));
                map.put(str.charAt(i), ++frequency);
            }
        }

        // 排序
        List<Map.Entry<Character, Integer>> infoIds = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o1.getKey()).compareTo(o2.getKey());
            }
        });
        // 输出
        for (int i = 0; i < infoIds.size(); i++) {
            System.out.println("字符" + infoIds.get(i).getKey() + "出现了" + infoIds.get(i).getValue() + "次");
        }
        return;
    }
}