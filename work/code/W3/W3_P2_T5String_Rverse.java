/*第5题 ：设计一个Java程序，完成: 将一个字符串转置后返回。
输入界面：
请输入一个字符串：abc123汉字
输出界面：
结果是：字汉321cba
*/
import java.util.Scanner;
public class W3_P2_T5String_Rverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("请输入字符串：");
        input = scanner.next();
        //"abc123汉字";
        StringBuffer sb =new StringBuffer(input);
        System.out.println("翻转字符串为：  "+sb.reverse());
    }
}
