import java.util.*;

public class W2_P1_T26 {
    // 句子中的词频统计
    /**
     * 采用字典，键值对的方式存放单词信息
     * 
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("请输入一个句子：");
        str = scanner.nextLine();
        wordcount(str);
        scanner.close();
    }

    public static void wordcount(String str) {
        String[] split = str.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < split.length; i++) {
            // map.get(),通过键名来获取键值
            if (map.get(split[i]) == null) {
                // map.put()将键值存储在map集合中，如果存在，那么就覆盖该键值，如果不存在就新建一个。
                map.put(split[i], 1);
            } else {
                int frequency = map.get(split[i]);
                map.put(split[i], ++frequency);
            }
        }

        // 排序
        List<Map.Entry<String, Integer>> infoIds = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getKey()).toString().compareTo(o2.getKey());
            }
        });
        // 输出
        for (int i = 0; i < infoIds.size(); i++) {
            String id = infoIds.get(i).toString();
            System.out.println(id);
        }

    }
}