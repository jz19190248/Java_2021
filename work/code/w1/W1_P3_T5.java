public class W1_P3_T5{
	//三位数的组成
	public static void main(String[] args){
		solution();
	}
	
	public static void solution(){
		int j = 0,k = 0;		
		for(int i = 100 ; i <= 333; i++ ){
			j = 2 * i; k = 3 * i;
			int m = i*1000000+j*1000+k;
			int sum=0,product=1;
			for(int a = 1; a <= 9;a++){
				sum += m%10;
				product = product * (m % 10);
				m = m/10;
			}
			if(sum == 45 && product == 362880)
				System.out.println(i+" : "+2*i+" : "+3*i);
		}
	}
}