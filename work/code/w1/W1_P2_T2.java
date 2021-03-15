import  java.util.Scanner;
public class W1_P2_T2{
	//范围内求和
	public static void main(String[] args){
		solution();
	}
		
	public static void solution(){
		Scanner sanner = new Scanner(System.in);
		System.out.print("请输入两个正整数（如：2  10）：");
		int i = sanner.nextInt();
		int j = sanner.nextInt();
		int sum = 0;
		for(int k = i;k <= j; k++){
			sum += k;
		}
		System.out.println(i+"+"+(i+1)+"+"+"..."+ (j)+"="+sum);
	}
	
} 