import  java.util.Scanner;
public class W1_P2_T1{
	//奇数求和
	public static void main(String[] args){
		solution();
	}
		
	public static void solution(){
		Scanner sanner = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int n = sanner.nextInt();
		int k= 1,sum = 0,i = 1;
		while(k <= n){
			sum += k;
			i++;
			k = 2*i-1;			
		}
		System.out.println(1+"+"+2+"+"+"..."+ (k-2)+"="+sum);
	}
	
} 