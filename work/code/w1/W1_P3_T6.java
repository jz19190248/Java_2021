import  java.util.Scanner;
public class W1_P3_T6{
	//输出康特数
	public static void main(String[] args){
		solution();
	}
	
	public static void solution(){
		int MAX = 10000;
		int cnt = 1;
		int[][] a = new int [MAX][MAX];
		Scanner scanner = new Scanner(System.in);
		int  n = scanner.nextInt();
		for(int i = 0 ; i < MAX ; i++ ){
			if(i%2 == 1) {
				for(int j = 1 ; j <= i ;j++){
					a[j][i+1-j] = cnt++;
				}
			}else{
				for(int  j = i ; j >= 1 ; j--)
					a[j][i+1-j] = cnt++;
			}
		}
		for(int i = 0 ; i < MAX; i++){
			for(int j = 0 ; j < MAX ; j++){
				if(a[i][j] == n)
					System.out.println(j+"/"+i);
			}
		}
	}
}