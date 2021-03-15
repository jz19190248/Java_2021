import  java.util.Scanner;
public class W1_P3_T7{
	//船长喝酒
	public static void main(String[] args){
		solution();
	}
	
	public static void solution(){
		int x1,x2,x3,x4;
		for( x1 = 20 ; x1 >= 4  ;x1--){
			for(x2 = x1-1 ; x2 >= 3; x2--){
				for(x3 = x2-1; x3 >= 2;x3--){
					for(x4 = x3-1 ;x4 >= 1;x4--){
						if((float)(1.0/x1)+(float)(1.0/x2)+(float)(1.0/x3)+(float)(1.0/x4) == 1){
							System.out.println(x1+","+x2+","+x3+","+x4);
						}
					}
				}
			}
		}
	}
}