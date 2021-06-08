import java.util.Scanner;
/*第2题 ：设计一个Java程序，完成：将一个字符串的重复字符进行压缩，只保留一个字符。。
如：原串是："aaabbcddd112233((55))"，压缩后结果是："abcd123(5)"
建议使用字符串的replaceAll（）来完成，代码十分简洁且高效。
输入界面：
请输入字符串： "aaabbcddd112233((55))
输出界面：
压缩结果是：abcd123(5)
*/
public class W3_P2_T2String_Compression {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String  str ;//=  "aaabbcddd112233((55)) ";
        System.out.println("请输入待压缩字符串：");
        str = scanner.next();
        String ans="";
        ans=str.replaceAll("(.)(?=.*\\1)","");
        System.out.println("压缩后的字符串为："+ans);
    }




}
