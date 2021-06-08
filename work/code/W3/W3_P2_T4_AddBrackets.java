/*
* ：设计一个Java程序，完成:将一个字符串中出现的子串两边加上方括号。
如：原串是："ab123ab123",子串是"ab"，则加上方括号后结果是：" [ab]123[ab]123"。
建议使用replaceAll(…)来完成，十分简洁高效。
输入界面：
请输入一个字符串：ab123ab123
请输入作为子串用的字符串：ab
输出界面：
结果是：[ab]123[ab]123
*/
import java.util.Scanner;

public class W3_P2_T4_AddBrackets {
    public static void main(String[] args) {
        String str;// = "";
        String str1 ;//= "ab";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        str=scanner.next();
        System.out.println("请输入子串");
        str1 = scanner.next();
        String substr = "["+str1+"]";
        System.out.println("结果是  "+str.replaceAll(str1,substr));
    }
}