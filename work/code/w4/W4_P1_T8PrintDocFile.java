import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class W4_P1_T8PrintDocFile {
    public static void main(String[] args) {
        System.out.println("请输入一个文件夹：");
    Scanner scanner = new Scanner(System.in);
    String filename = scanner.next();
    String[] files= (new File(filename)).list(new myFileNameFilter());
        System.out.println("以doc为后缀的文档如下：");
    for(String file :files){
        System.out.println(file);
        }
    }
}

class myFileNameFilter implements FilenameFilter{
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".doc");
    }
}
