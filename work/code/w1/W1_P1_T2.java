import  java.util.Scanner;

public class W1_P1_T2{
	//树打印
	public static void main(String[] args){
		solution();
	}
		
	public static void solution(){
		Scanner sanner = new Scanner(System.in);
		String ch = sanner.nextLine();
		int n = sanner.nextInt();
		int t = sanner.nextInt();


		
		for(int  i = 1 ; i <= n; i++ ){//打印树冠
			for(int k = 1 ; k <= n - i; k++){
				System.out.print("  ");
			}
			for(int  j = 1 ; j <= 2*i-1; j++){
				System.out.print(ch);
			}
			System.out.println();
		}
		
		for(int i = 1; i <= t ; i++){//打印树干
			for(int j = 1 ;j <  n; j++)
				System.out.print("  ");
			System.out.println(ch);
		}
		
	}
	
} 