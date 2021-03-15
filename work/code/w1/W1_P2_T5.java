import  java.util.Scanner;
public class W1_P2_T5{
	//输出前n质数
	public static void main(String[] args){
		solution();
	}
		
	public static void solution(){
		Scanner sanner = new Scanner(System.in);
		System.out.print("请输入两个正整数值（如：8  3）：");
		int n = sanner.nextInt();
		int k = sanner.nextInt();
		int m = 2,a = 0,i = 0;
		while( i <= n ){
			if(isPrime(m)) { System.out.print(m+"  "); a++;i++;}
			if(a == k){ System.out.println();a = 0;}
			m++;
		}
	}
	public static boolean isPrime(int n){
		for(int k = 2;k < n;k ++){
			if(n % k == 0)  return false;
		}
		return true;
	}
} 