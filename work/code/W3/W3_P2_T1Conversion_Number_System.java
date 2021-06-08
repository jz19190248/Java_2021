
/*第1题 ：设计一个Java程序，完成：将无符号的k进制数据的字符串，转成m进制数值返回。
输入界面：
请输入原进制：3
该进制的数值串：102
请输入目标进制：5
输出界面：
3进制数102转换成5进制结果是：21

再如：
输入界面：
请输入原进制：3
该进制的数值串：104
输出界面：104是非法的3进制数！

 */
import java.util.*;
import java.lang.*;
public class W3_P2_T1Conversion_Number_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("请输入原进制：");
            int N = scanner.nextInt();
            System.out.println("请输入字符串：");
            String str = scanner.next();
            System.out.println("请输入目标进制：");
            int M = scanner.nextInt();
            int  k = Integer.parseInt(str,N);
            System.out.println(N+"进制数"+str+"转换为"+M+"进制数为"+Integer.toString(k,M));
            scanner.close();
        }
        catch (NumberFormatException e1){
            System.out.println("非法的进制数");
        }
    }

}
