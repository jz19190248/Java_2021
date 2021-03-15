public class W1_P1_T3{
	//byte拼装
	public static void main(String[] args){
		solution();
	}
		
	public static void solution(){
		byte b1=(byte)0xaa,b2=(byte)0xbb,b3=(byte)0xcc,b4=(byte)0xdd;
		int result = ((b4&0xFF)<<(8*3))|((b3&0xFF)<<(8*2))|((b2&0xFF)<<(8))|(b1&0xFF);
		System.out.println(Integer.toHexString(result));
	}
	
} 