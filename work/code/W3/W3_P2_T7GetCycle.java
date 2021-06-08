/*设计一个Java程序，完成: 如果一个字符串可以由某个长度为k的字符串重复多次得到，则称该串以k为周期。例如，abcabcabcabc以3为周期（注意，它也以6和12为周期）。
输入一个长度不超过80的字符串，输出其最小周期。
输入界面：
请输入一个字符串：abcabcabcabc
输出界面：
字符串：abcabcabcabc的最小周期为：3
*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class W3_P2_T7GetCycle {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String str;// = "abcabcabcabc";
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        Pattern  pattern = Pattern.compile("(.+?)(\\1)+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()){
            String sub = matcher.group(1);
            System.out.println(str+" 的最小周期为"+sub.length());
        }
    }
}
