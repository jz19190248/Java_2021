import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class W4_P1_T1CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入源文件：");
        String sourceFile = scanner.next();
        String destFile = "newFile.txt" ;
        if(copyFile(sourceFile,destFile)) {
            System.out.println("文件复制成功，命名为" + destFile);
        }
    }
    public  static  boolean  copyFile(String  sourceFile,String   destFile){
        try{
            //使用try语句有自动关闭资源的作用，所以这里可以不需要使用fis.close();
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            byte[] buff = new byte[32];
            int hasRead = 0 ;
            while((hasRead = fis.read(buff)) > 0 ){
                fos.write(buff,0,hasRead);
            }
            return  true;
        }
        catch (IOException ioe){
                ioe.printStackTrace();
                return false;
        }
    }
}
