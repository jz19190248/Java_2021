/*设计一个Java程序，完成: 给出一种物质的分子式（不带括号），求分子量。
本题中的分子式只包含4种原子，分别为C, H, O, N，原子量分别为12.01, 1.008, 16.00, 14.01（单位：g/mol）。
输入界面：
请输入分子式：C6H5OH
输出界面：
分子式：C6H5OH 的分子量为94.108g/mol。
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 这道题目有几个注意点，分子式可能是正常的C6H2O1这样字母数字交错的形势
 * 也可能是CH2O这样某些字母多的形式，也可能C11H9O23这样的多数字的形式
 * 需要考虑周全
 */
public class W3_P2_T6CaculateMolecole {
    public static void main(String[] args) {
        String molecular;// = "C6H5OH ";
        System.out.println("请输入分子式：");
        Scanner scanner =new Scanner(System.in);
        molecular = scanner.next();
        HashMap<Character,Double> map = new HashMap<Character, Double>();
            map.put('C',12.01);map.put('H',1.008);
            map.put('O',16.00);map.put('N',14.01);
            //这里可以使用static修饰初始化代码块
        double sum = 0.0;
        if( !molecular.matches("([CHNO]\\d*)+")){
            System.out.println("分子式不正确");
            return ;
        }
        Matcher m = Pattern.compile("[CHON]\\d*").matcher(molecular);
                                    //([CHON])(\\d*),后边就可以通过group(1)来获取CHON
        while(m.find()){
            //在这里老师使用的方法是使用正则表达式组号来实现的
            if(m.group().length()>1){
                sum+=(map.get(molecular.charAt(m.start()))
                        *Integer.parseInt(m.group().substring(1)));
            }
            else{
            sum+=map.get(molecular.charAt(m.start()));}
        }
        System.out.println("分子质量为:"+sum+"g/mol");

    }
}
