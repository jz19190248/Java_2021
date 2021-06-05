import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 设计一个Java程序：完成：将一个采用默认字符集的文本文件中的所有的数值全部抽取出来，并存放到另个一个文本文件中。
 */
public class W4_P1_T13GetNumber {
    public static void main(String[] args) {
        try{
            BufferedReader br =
                    new BufferedReader((new InputStreamReader(
                            new FileInputStream("getnumber.txt"),"GBK")));
            String str;
            FileOutputStream fos = new FileOutputStream("number.txt");
            while((str = br.readLine())!=null){
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(str);
                while(m.find()){
                    fos.write((m.group()+" ").getBytes());
                }
            }
            System.out.println("获取成功");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
