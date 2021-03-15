import  java.util.Scanner;
public class W1_P3_T1{
	//最大公约数求解
	public static void main(String[] args){
		Scanner sanner = new Scanner(System.in);
		System.out.print("请输入两个正整数：");
		int a = sanner.nextInt();
		int b = sanner.nextInt();
		System.out.println("方法1： "+a+"和"+b+"的最大公约数是: "+solution1(a,b));
		System.out.println("方法2： "+a+"和"+b+"的最大公约数是: "+solution2(a,b));
		System.out.println("方法3： "+a+"和"+b+"的最大公约数是: "+solution3(a,b));
	}
	
	//方法1： 通过减法完成
	public static int solution1(int a,int b){
		while(a != b){
			if(a > b) a -= b;
			else  b -= a;
		}
		return a;
	}
	//方法2： 通过模运算完成
	public static int solution2(int a,int b){
		int temp;
		while(b != 0){
			temp = a;
			a = b;
			b =  temp % b;
		}
		return a;
	}
	//方法3：循环递增试探法
	public static int solution3(int a,int b){
		int c = 1,i = 1;
		while(i < a && i < b){
			if((a % i == 0)&&(b % i == 0))  c = i;
			i++;
		}
		return c;
	}
} 