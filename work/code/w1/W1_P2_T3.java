import  java.util.Scanner;
public class W1_P2_T3{
	//等距范围求和
	public static void main(String[] args){
		solution();
	}
		
	public static void solution(){
		Scanner sanner = new Scanner(System.in);
		System.out.print("请输入三个正整数（如：3 4 20）：");
		int i = sanner.nextInt();
		int k = sanner.nextInt();
		int j = sanner.nextInt();
		int sum = 0,n=0,m=0;
		while( n <= j ){
			sum += n;
			n = i + m * k;
			m++;
		}
		System.out.println(i+"+"+(i+1*k)+"+"+"..."+ (n-k)+"="+sum);
	}
	
} 