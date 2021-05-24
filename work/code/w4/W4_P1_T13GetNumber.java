import java.io.FileInputStream;
import java.io.IOException;

/**
 * 设计一个Java程序：完成：将一个采用默认字符集的文本文件中的所有的数值全部抽取出来，并存放到另个一个文本文件中。
 */
public class W4_P1_T13GetNumber {
    public static void main(String[] args) {
       try {
           FileInputStream fis = new FileInputStream("withNumber.txt");
       }catch (IOException e){
           e.printStackTrace();
       }
    }

}
