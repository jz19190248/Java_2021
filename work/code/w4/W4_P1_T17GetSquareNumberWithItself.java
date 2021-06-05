import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class W4_P1_T17GetSquareNumberWithItself {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("17result.txt");
            for(int i = 100 ; i<1000;i++){
                String number = String.valueOf(i);
                String square = String.valueOf(i*i);
                Pattern pattern = Pattern.compile(number);
                Matcher m = pattern.matcher(square);
                if(m.find()) fw.write(number+"   "+square+"\n");
            }
            System.out.println("运行结束");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
