import java.util.Scanner;

public class W2_P1_T22 {
    // 英文字符统计输出
    //选择了一种通用但是效率较低的写法
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("请输入一个字符串：");
        String str  = scanner.nextLine();
        int length = str.length();
        int [] cnt = new int[length];
        for(int i  = 0 ; i < length ; i++){
            cnt[i] = 0;
        }
        for(int i = 0 ; i <length;i++){
            
        }


        scanner.close();
    }

    public static void solution(int x, int[] array, int N) {

    }

}