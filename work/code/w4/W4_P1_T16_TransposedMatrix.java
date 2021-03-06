import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
public class W4_P1_T16_TransposedMatrix {
    public static void main(String[] args) {
        try{
            BufferedReader br =  new BufferedReader(new FileReader("data.txt"));
            FileWriter fw = new FileWriter("data90.txt");

            Vector<Vector<String>> vecmatrix = new Vector<Vector<String>>();
            String strLine;
            int oRow = 0;
            while( (strLine = br.readLine()) != null){
                String[] lineArray = strLine.split("\\s+");
                Vector<String> vecline = new Vector<String>();
                for(oRow = 0 ; oRow < lineArray.length;oRow++){
                    vecline.add(lineArray[oRow]);
                }
                vecmatrix.add(vecline);
            }
            for(int  j = 0 ; j < oRow;j++){
                for( int  i = 0 ; i < vecmatrix.size();i++){
                    fw.write(vecmatrix.get(i).get(j)+"  ");
                }
                fw.write("\n");
            }

            System.out.println("转置完成");
            fw.close();
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
