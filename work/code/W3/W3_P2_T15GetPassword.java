/*第15题：设计一个Java程序，完成: 帐号密码加密处理。
说明：
在对银行账户等重要权限设置密码的时候，常常遇到这样的烦恼：如果为了好记用生日吧，容易被破解，不安全；如果设置不好记的密码，又担心自己也会忘记；如果写在纸上，担心纸张被别人发现或弄丢了...
该程序的功能是把一串拼音字母转换为6位数字（密码）。可以使用任何好记的拼音串(比如名字，王喜明，就写：wangximing)作为输入，程序输出6位数字。
变换的过程如下：
第一步. 把字符串6个一组折叠起来，比如wangximing则变为：
wangxi
ming
第二步. 把所有垂直在同一个位置的字符的ascii码值相加，得出6个数字，如上面的例子，则得出：
228 202 220 206 120 105
第三步. 再把每个数字“缩位”处理：就是把每个位的数字相加，得出的数字如果不是一位数字，就再缩位，直到变成一位数字为止。例如: 228 => 2+2+8=12 => 1+2=3

上面的数字缩位后变为：344836, 这就是程序最终的输出结果！

要求：
输入格式为：第一行是一个整数n（<100），表示下边有多少输入行，接下来是n行字符串，就是等待变换的字符串。
输出格式为：n行变换后的6位密码。

例如，输入：
5
zhangfeng
wangximing
jiujingfazi
woaibeijingtiananmen
haohaoxuexi
则输出：
772243
344836
297332
716652
875843
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther jiangze
 * @description 拼音变数字
 * @data 2021/6/7
 */
public class W3_P2_T15GetPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("用户输入：");
        int n = scanner.nextInt();
        String [] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings [i] = scanner.next();
        }
        System.out.println("则程序输出：");
        for (int i = 0; i < n; i++) {
            getPassword(strings[i]);
        }
        //getPassword("wangximing");

        scanner.close();
    }
    public static void getPassword(String string){
        Pattern pattern = Pattern.compile("(\\w){1,6}");
        Matcher matcher = pattern.matcher(string);
        int []password = new int[6];

        while(matcher.find()){
            String s = matcher.group();
            int  i = 0 ;
            while(i < s.length()){
                password[i] += Integer.valueOf(s.charAt(i));
                i++;
            }
        }
        for(int j = 0 ; j < 6;j++){
            password[j] = numberCompression(password[j]);
            System.out.print(password[j]);
        }
        System.out.println();
    }
    public static int numberCompression(int n){
        if(n % 10 == n){
            return n;
        }
        else{
            int temp = 0 ;
            while(n > 0){
                temp += n % 10;
                n /= 10;
            }
            return numberCompression(temp);

        }
    }
}
