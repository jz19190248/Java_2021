import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class W4_P1_T15PrintPrimeNumbers {
    private  static int[] numbers =  new int[100000];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p ,s,t;
        p = scanner.nextInt();s = scanner.nextInt();t = scanner.nextInt();
        try{
        FileWriter fw = new FileWriter("primes.txt");
        //采用素数筛法找出素数
            int count = 0 ;

            for(int i  = p; i < s ;i++){
                if(numbers[i] == 0){
                    for( int j = 2 ; j * i < s ;j++) {
                        numbers[i * j] = 1;
                    }
                    count++;fw.write((String.valueOf(i)+" "));
                    if(count == t){
                        count = 0;
                        fw.write("\n");
                    }
                }
            }
            System.out.println("素数写入完毕");
        fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        scanner.close();
    }

}
