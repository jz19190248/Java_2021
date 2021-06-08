/*设计一个Java程序，完成:模板替换功能
设有模板串如下：(注：${变量名}是定义的变量)
"请${当前患者}患者到${诊室}等候。${等候患者}患者准备…"，
另外一个是数据源串如下：
"当前患者:王一萍,诊室:一号诊室,等候患者:李芳"，
将数据源串中的数据值替换掉模板串中的相应变量，则结果是：
请王一萍患者到一号诊室等候。李芳患者准备…
输入界面：
请输入模板串：请${当前患者}患者到${诊室}等候。${等候患者}患者准备…
请输入数据源串：当前患者:王一萍,诊室:一号诊室,等候患者:李芳
输出界面：
结果：请王一萍患者到一号诊室等候。李芳患者准备…
*/
import java.awt.*;
import java.util.Scanner;

/**
 * @auther jiangze
 * @description 模板替换
 * @data 2021/6/6
 * 思路，这里想到可以用两种办法，一种是采用hashmap来存储<当前患者，王一平>这样的形势打印，
 * 但是远远没用采用replaceall方便
 */
public class W3_P2_T8TemplateReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入模板串：");
        String strTemplate= scanner.next();
        System.out.print("请输入数据源串：");
        String strSource = scanner.next();

        String [] Temp = new String[3];
        Temp = strSource.split(",");

        String presentPatient = Temp[0].split(":")[1];
        String ward = Temp[1].split(":")[1];
        String waitPatient = Temp[2].split(":")[1];

        String result = strTemplate.replaceFirst("\\$\\{.{2,4}\\}",presentPatient)
                .replaceFirst("\\$\\{.{2,4}\\}",ward)
                .replaceFirst("\\$\\{.{2,4}\\}",waitPatient);

        System.out.println(result);

    }
}
