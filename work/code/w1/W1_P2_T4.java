import  java.util.Scanner;
public class W1_P2_T4{
	//范围质数输出
	public static void main(String[] args){
		solution();
	}
		
	public static void solution(){
		Scanner sanner = new Scanner(System.in);
		System.out.print("请输入三个正整数值（如：5  18  3）：");
		int i = sanner.nextInt();
		int j = sanner.nextInt();
		int k = sanner.nextInt();
		int m = i,a = 0;
		while( m <= j ){
			if(isPrime(m)) { System.out.print(m+"  "); a++;}
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