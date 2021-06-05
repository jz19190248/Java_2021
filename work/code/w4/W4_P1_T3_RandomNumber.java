import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
public class W4_P1_T3_RandomNumber {
    public static void main(String[] args) {
        FileOutputStream fos;
        byte []buff;
        String filename = "T3_1";
        int[] randomNumber;
        randomNumber = getRamNumber();
        try{
            fos = new FileOutputStream(filename);
            for(int  i = 0 ; i < 100 ;i++){
                String str = String.valueOf(randomNumber[i]);
                String str1 = str+" ";
                buff = str1.getBytes();
                fos.write(buff);
            }
            System.out.println("文件写入完毕");
                readFile(filename);
            fos.close();
        }
        catch(IOException ioe1){
            ioe1.printStackTrace();
        }
    }
    public static void readFile(String filename) throws IOException{
        System.out.println("开始阅读文件并打印内容");
        FileInputStream fis ;
            fis = new FileInputStream(filename);
            int a=0;
            double sum = 0;
            while ((a=fis.read())!= -1){
                System.out.print((char)a);
                sum += a;
            }
            System.out.println("\n和为："+sum+"     平均数为："+(sum/100));
        fis.close();

    }
    public static  int[] getRamNumber(){
        Random random = new Random();
        int []RandomNumber = new int[100];
        for(int i = 0; i < 100;i++){
            RandomNumber[i] = random.nextInt(1000);
        }
        System.out.println("成功生成随机数");
        return RandomNumber;
    }
}
