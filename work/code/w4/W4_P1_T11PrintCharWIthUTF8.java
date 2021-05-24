import java.io.FileReader;
import java.io.IOException;

/**
 * 设计一个Java程序：完成：将一个采用UTF-8字符集的文本文件中每一个字符在屏幕中输出。
 * 说明：在计算机的记事本中输入汉字，使用UTF-8编码存盘成文本文件来测试。
 * */
public class W4_P1_T11PrintCharWIthUTF8 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("UTF8.txt");
            int hasread = 0 ;
            char[] chs = new char[1024];
            while((hasread = fr.read(chs))>0){
                System.out.println(new String(chs,0,hasread));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
