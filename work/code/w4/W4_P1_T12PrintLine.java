import java.io.*;

/**
 * */
public class W4_P1_T12PrintLine {
    public static void main(String[] args) {
        try{
            BufferedReader br =
                    new BufferedReader((new InputStreamReader(
                            new FileInputStream("ANSI.txt"),"GBK")));
            String str;
            while((str = br.readLine())!=null){
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
