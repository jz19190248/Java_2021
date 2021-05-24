
import java.util.regex.*;
import java.lang.*;
import java.util.Arrays;
 public class GetSum {
     public static void main(String[] args) {
         String str = "123%^(56)hfghjf6787()HJKH21";
         String regex = "[^0-9]+";
         str.replaceFirst(regex,"");
         String [] parts= str.split(regex);
         //System.out.println(Arrays.toString(parts));
         int  i =0;
         int  sum = 0 ;
         while(i < parts.length ){
             //System.out.println(parts[i]);
             sum +=Integer.parseInt(parts[i]);
             i++;
         }
         System.out.println(sum);
     }
}