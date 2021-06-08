/*第11题 ：设计一个Java程序，完成:数据分析与提取。
如：已知数据“name=王一水   sex=男   age=21   class=计算机1班 ”
数据分析后，生成串“王一水   男  21   计算机1班”
输入界面：
请输入一个串：name=王一水   sex=男   age=21   class=计算机1班
输出界面：
结果：王一水   男  21   计算机1班
*/

import java.util.Scanner;

/**
 * @auther jiangze
 * @description 信息提取
 * @data 2021/6/7
 */
public class W3_P2_T11GetInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个串：");
        String str = scanner.nextLine();
        String [] strings = str.split("\\s+");
        System.out.print("结果： ");
        for(String string : strings){
            System.out.print(string.split("=")[1]+"  ");
        }
        System.out.println();
    }
}
