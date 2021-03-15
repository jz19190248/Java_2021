public class W1_P1_T1{
	//九九乘法表打印
	public static void main(String[] args){
		solution();
	}
	public static void solution(){
		for(int  i = 1 ; i <= 9; i++){
			for(int  j = 1 ; j <= i ; j++){
				System.out.print(" "+j+" * "+i+" = "+(i*j)+"\t");
			}
			System.out.print("\n");
		}
	}
} 