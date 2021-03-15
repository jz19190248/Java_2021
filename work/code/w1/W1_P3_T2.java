public class W1_P3_T2{
	//平方数判断
	public static void main(String[] args){
		solution();
	}
	
	public static void solution(){
		int j = 1000;
		for(int  i = 30; i*i <= 9999; i++){
		//30*30=900,比较接近1000，从这里开始判断多余运算数据较少
			j = i*i;
			if(((j/100)%11 == 0)&&((j%100)%11 == 0))
				System.out.println(j);
		}
	}
}