/*设计一个Java程序，完成: 字符串的压缩编码。
如：字符串："aaaagbbbaaccc"压缩后的结果是："a4gb3a2c3"
即：每一个字符后跟它连续重复的次数。如：aaaa压缩成：a4。注意只有一个，则保持不变。如上例中的字符g
输入界面：
请输入一个字符串：aaaagbbbaaccc
输出界面：
压缩后的结果是："a4gb3a2c3"
*/

import javax.print.attribute.standard.Compression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther jiangze
 * @description 字符串编码压缩
 * @data 2021/6/7
 */
public class W3_P2_T13StringCompression {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String input = scanner.nextLine();
        Compression(input);
        scanner.close();
    }
    public  static  void Compression(String string){
        String regex= "(.)(\\1)*";
        String result = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while(matcher.find()){
            String temp = matcher.group();
            //System.out.print(temp+" ");
            String str1 = temp.replaceAll("(.)+","$1"+String.valueOf(temp.length()))
                    .replaceAll("1","");
            result+=str1;
        }
        System.out.println("压缩后的结果是："+result);
    }
}
