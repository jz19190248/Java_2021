import  java.util.Scanner;
public class W1_P2_T6{
	//代数式和计算
	public static void main(String[] args){
		solution();
	}
		
	public static void solution(){
		Scanner sanner = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int n = sanner.nextInt();
		float sum = 0;
		for(float i = (float)1.0 ; i <= n ;i++){
			sum += (float)(1/i);
			i++;
			sum -= (float)(1/i);
		}
		System.out.print(sum);
	}


} 