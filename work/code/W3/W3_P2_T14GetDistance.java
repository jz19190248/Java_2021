/*
* 设计一个Java程序，完成:机器人的行走的距离计算。
说明：智能机器人可以接受预先输入的指令，按指令行动。机器人的基本动作很简单，只有3种：左转（记为L），右转（记为R），向前走若干厘米（直接记数字）。
例如，我们可以对小车输入如下的指令：15L10R5LRR10R20
则含义是：机器人先直行15厘米，左转，再走10厘米，再右转，...不难看出，对于此指令串，机器人又回到了出发地。
设计一个Java程序，完成：由用户输入指令，程序输出每条指令执行后机器人位置与指令执行前机器人位置的直线距离。
要求：用户先输入一个整数n（n<100），表示接下来将有n条指令。
接下来输入n条指令。每条指令只由L、R和数字组成（数字是0~100之间的整数）
每条指令的长度不超过256个字符。
程序则输出n行结果。
每条结果表示小车执行相应的指令前后位置的直线距离。要求四舍五入到小数后2位。

例如：用户输入：
5
L100R50R10
3LLL5RR4L12
LL
100R
5L5L5L5

则程序输出：（小数点保留2位，四舍五入）
102.96
9.06
0.00
100.00
0.00
*/

import java.util.HashMap;
import java.util.Scanner;

/**
 * @auther jiangze
 * @description 计算机器人行走的距离
 * @data 2021/6/7
 */
public class W3_P2_T14GetDistance {
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
           getDistance(strings[i]);
        }
        //getDistance("L100R50R10");
        scanner.close();
    }
    public static void getDistance(String instr){
        HashMap<Character,Integer> xoy = new HashMap<Character,Integer>();
        xoy.put('U',0);xoy.put('D',0);
        xoy.put('L',0);xoy.put('R',0);
        //这里建了一个坐标系,表示坐标方向和坐标距离
        HashMap<Character,Character> nextRFlag = new HashMap<Character,Character>();
        nextRFlag.put('U','R');nextRFlag.put('R','D');
        nextRFlag.put('D','L');nextRFlag.put('L','U');
        //右转方向变化
        HashMap<Character,Character> nextLFlag = new HashMap<Character,Character>();
        nextLFlag.put('U','L');nextLFlag.put('L','D');
        nextLFlag.put('D','R');nextLFlag.put('R','U');
        //左转方向变化
        Character Flag = 'L';//当前前进方向
        String str1 = instr.replaceAll("R","|R|")
                .replaceAll("L","|L|");
        System.out.println();
        String [] strings = str1.split("\\|");
        for (String string:strings){
            switch (string){
                case ("R"):{
                    Flag = nextRFlag.get(Flag);
                    break;
                }
                case ("L"):{
                    Flag = nextLFlag.get(Flag);
                    break;
                } case(""):{
                    break;
                }
                default:{
                    xoy.put(Flag,xoy.get(Flag)+Integer.parseInt(string));
                    break;
                }
            }
        }
        int x = Math.abs(xoy.get('U')-xoy.get('D'));
        int y =  Math.abs(xoy.get('R')-xoy.get('L'));
        double reslut = Math.sqrt(x*x+y*y);
        System.out.printf("%.2f",reslut);
    }
}
