import java.util.Scanner;

/**
 * @auther jiangze
 * @description RC地址转换
 * @data 2021/6/7
 */
/*第9题 ：设计一个Java程序，完成: Excel中，实现从RC地址格式到常规地址格式的转换。
说明：Excel是最常用的办公软件。每个单元格都有唯一的地址表示。
比如：第12行第4列表示为：“D12”，第5行第255列表示为“IU5”。
这是地址格式的常规表示。特点是：第1列用A表示，第2列用B表示。第26列用Z表示，第27列用AA表示，第28列用AB表示。
事实上，Excel提供了两种地址表示方法，还有一种表示法叫做RC格式地址。
第12行第4列表示为：“R12C4”，第5行第255列表示为“R5C255”。
【输入、输出格式要求】
用户先输入一个整数n（n<100），表示接下来有n行输入数据。
接着输入的n行数据是RC格式的Excel单元格地址表示法。
程序则输出n行数据，每行是转换后的常规地址表示法。

例如：用户输入：
2
R12C4
R5C255

则程序应该输出：
D12
IU5
*/
public class W3_P2_T9TransformRCAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个整数n（n<100），表示接下来有n行输入数据: ");
        int n = scanner.nextInt();
        System.out.println("输入的" + n + "行数据(RC格式的Excel单元格地址表示法): ");
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        System.out.println("转换后的常规地址表示法: ");
        for (String str : strings) {
            System.out.println(TransformAddress(str));
        }
    }
    public static String TransformAddress(String str){
        String result = "";
        String [] strings = str.split("C");
        String  letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int col = Integer.parseInt(strings[1]);
        String strCol = "";
        while(col>0){
            strCol = letters.substring(col%26-1,col%26)+strCol;
            col /=26;
        }
        result =strCol+strings[0].substring(1);
        return  result;
    }
}
