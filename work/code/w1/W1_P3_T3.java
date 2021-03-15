import  java.util.Scanner;
public class W1_P3_T3{
	//大数计算
	public static void main(String[] args){
		solution();
	}
	
	public static void solution(){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int MOD = 1000000;
		int sum = 0;
		for(int  i = 1 ; i <= n ;i++){
			int  k = 1;
			for(int j = 1 ; j <= i ;j++)
				k = (k*j)%MOD;//	求阶乘的过程中只取后六位数进行处理
			sum = (sum + k) % MOD;
		}
		System.out.println(sum);
	}
}