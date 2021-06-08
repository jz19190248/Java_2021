/*第10题 ：设计一个Java程序，完成:将一个字符串中的所有的单词全部翻转。如：
"To676767Be     or 878 not()() to &**^be"，将内部单词翻转后，结果是：
" oT676767eB     ro 878 ton()() ot &**^eb "
输入界面：
请输入一个串：To  be  or  not  to  be!
输出界面：
翻转结果：oT  eb  ro  ton  ot  eb!
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther jiangze
 * @description 单词内部反转
 * @data 2021/6/7
 */
public class W3_P2_T10WordReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个串：");
        String inputStr  =scanner.nextLine();
        System.out.print("反转后：");
        StringBuffer sb = new StringBuffer();
        String regex = "([a-zA-Z]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputStr);
        while(matcher.find()) {
            matcher.appendReplacement(sb,
                    (new StringBuffer(matcher.group()).reverse().toString()));
        }
        matcher.appendTail(sb);
        System.out.println(sb.toString());
    }
}
