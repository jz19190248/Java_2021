import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class W4_P1_T2Keyin {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入字符串：");
            String  buff = scanner.next();
            ByteArrayInputStream BAinput = new ByteArrayInputStream(buff.getBytes());
            FileOutputStream os = new FileOutputStream("T2_1.txt") ;
            int hasRead  = 0 ;
            while((hasRead = BAinput.read()) != -1){
                os.write(hasRead);
            }

        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
