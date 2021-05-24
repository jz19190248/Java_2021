import java.util.Scanner;
import java.util.regex.*;

public class String_Compression {
    public static  void main(String[] args){

        String  str =  "aaabbcddd112233((55)) ";
        //Parttern parttern = parttern.compile("(.)(?=.*\\\\1)");
        System.out.println(myConpression(str));
    }
    public static String myConpression(String str){
            String ans="";
            ans=str.replaceAll("(.)(?=.*\\\\1)","");
            return ans;
    }


}
