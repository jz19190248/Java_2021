
import java.io.*;

/**
 *Reader 能将其他编码的流转化为UTF8并存储在内存中
 * 但是问题i是这里如果使用UTF8存储会出现乱码
 * 所以这里使用的是gbk字符集编码
 */
public class W4_P1_T10printStringWithDefaultCharset {
    public static void main(String[] args) {
        try{
            BufferedReader br =
                    new BufferedReader((new InputStreamReader(
                            new FileInputStream("ANSI.txt"),"gbk")));
        int hasread = 0 ;
        char[] chs = new char[1024];
        while((hasread = br.read(chs))>0){
            System.out.println(new String(chs,0,hasread));
        }
    }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
