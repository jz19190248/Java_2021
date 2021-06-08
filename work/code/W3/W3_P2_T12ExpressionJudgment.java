/*设计一个Java程序，完成: 表达式整理，去掉多余的括号。假设输入的表达式是正确的（不用检验是否正确），
且只是由+和*两种运算组成。
如："(((2))*(((4+1))))+2"，去掉多余括号后，结果是："2*(4+1)+2"
输入界面：
请输入表达式：(((2))*(((4+1))))+2
输出界面：
去掉多余括号后，结果是：2*(4+1)+2
*/

import java.util.Scanner;

/**
 * @auther jiangze
 * @description 表达式判断
 * @data 2021/6/7
 * 去除重复字符串时考虑到以下几种情况：
 *    1、乘法外边套括号是多余的；2括号外边套括号是多余的；3，加法时只有右括号需要添加左括号；4，单独数字外边套括号是多余的
 */
public class W3_P2_T12ExpressionJudgment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入表达式：");
        String string = scanner.next();
        String result = string.replaceAll("\\(+(\\d+\\*\\d+)\\)+", "$1")
                .replaceAll("\\(+(\\d+\\+\\d+)\\)+", "($1)")
                .replaceAll("\\(+(\\d+.+\\d+\\))\\)+", "($1")
                .replaceAll("\\(+(\\d+)\\)+", "$1");
        System.out.println("去掉多余括号后，结果是：" +result);
        scanner.close();
    }
}
