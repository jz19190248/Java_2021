import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import  java.util.*;
//注意到一个现象，写入文件以后，如果没有close是不会保存的，所以即使在try里面，也要使用close
public class W4_P1_T14ScoreStatistic {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("score.txt"));
            FileWriter wf = new FileWriter("result.txt");
            String strline;
            int sumChinese = 0,sumMath = 0,sum = 0;
            Vector<String> name = new Vector<String>(),no = new Vector<String>();
            Vector<Integer> ChineseScore = new Vector<Integer>();
            Vector<Integer> MathScore = new Vector<Integer>();
            String [] record;
            while((strline = bf.readLine() )!= null){
                record = strline.split("\\s+");
                no.add(record[0]);
                name.add(record[1]);
                ChineseScore.add(Integer.parseInt(record[2]));sumChinese+=Integer.parseInt(record[2]);
                MathScore.add(Integer.parseInt(record[3]));sumMath+=Integer.parseInt(record[3]);
            }
            int len =no.size();
            wf.write("语文平均分"+sumChinese/len+"\n");
            wf.write("数学平平均分"+sumMath/len+"\n");
            for(int  i = 0; i < len;i++){
                wf.write(no.get(i)+"  "+name.get(i)+"  "
                        +"总分:"+(ChineseScore.get(i)+MathScore.get(i))+"\n");
            }
            System.out.println("操作成功");
            bf.close();
            wf.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
