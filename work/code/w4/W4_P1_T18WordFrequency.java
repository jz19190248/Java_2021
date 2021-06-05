import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class W4_P1_T18WordFrequency {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        try {
            FileReader fr = new FileReader("18data.txt" );
            FileWriter fw = new FileWriter("18result.txt");
            char[] ch = new char[1024];
            while((fr.read(ch,0,1) ) > 0){
                //System.out.print(ch);
                if(!map.containsKey(ch[0])){
                    map.put(ch[0],1);
                }else{
                    map.put(ch[0],map.get(ch[0])+1);
                }
            }
            System.out.print(map);
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                String record = "("+String.valueOf(entry.getKey())+","+String.valueOf(entry.getValue())+")";
                fw.write(record);
            }
            System.out.println("统计完毕");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
