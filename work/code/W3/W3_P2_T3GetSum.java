/*第3题 ：设计一个Java程序，完成：对字符串中包含的整数值求出和。如："ab123%^(56)hfghjf6787()HJKH21"，则对其中包含的数值：123,56,6787,21求出其和。
建议：使用split()及正则表达式来抽取整数值，十分方便。
输入界面：
请输入一个字符串：ab123%^(56)hfghjf6787()HJKH21
输出界面：
和=…….
思考：最多四个数字串组成的值进行求和。如：c789yz45!786*+56abc123456789
拆分后的整数为：789、45、786、56、1234、5678、9，再求和。
 */
import java.util.Scanner;
import java.util.regex.*;
import java.lang.*;
import java.util.Arrays;
 public class W3_P2_T3GetSum {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("请输入一个字符串：");
         String str = scanner.nextLine();
         System.out.println("和="+getsum(str));
         System.out.println("四位数和="+getsum1(str));
     }
     public static int getsum(String str){
         int sum = 0 ;
         String regex = "\\d+";
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(str);
         while(matcher.find()){
             sum+=Integer.parseInt(matcher.group());
         }
            return sum;
     }
     public static int getsum1(String str){
         int sum = 0 ;
         String regex = "\\d{1,4}";
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(str);
         while(matcher.find()){
             sum+=Integer.parseInt(matcher.group());
         }
         return sum;
     }
}