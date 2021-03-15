import  java.util.Scanner;
public class W1_P3_T4{
	//大数计算
	public static void main(String[] args){
		solution();
	}
	
	public static void solution(){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(),k3 = 0;//假设每排三人时，站K3排，余a人
		int b = scanner.nextInt(),k5 = 0;
		int c = scanner.nextInt(),k7 = 0;
		for(k3 = 3; k3 <=33;k3++){//总人数大于等于10，但是小于等于100，由此可以给出范围；
			for(k5 = 2; k5 <= 20;k5++){
				for(k7 = 1;k7 <= 14 ;k7++){
					if((3*k3+a == 5*k5 +b) &&(3*k3+a == 7*k7+c)){
						System.out.println("总人数（最小值）="+ (3 * k3 + a));
						return ;
					}
				}
				
			}
		}
		System.out.println("无解");
		return;
	}
}