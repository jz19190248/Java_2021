import java.io.File;
import java.util.Scanner;

public class W4_P1_T7PrintHiddenFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个文件夹：");
        String filename = scanner.next();
        printHiddenFIle(filename);
        scanner.close();
    }
    public static void printHiddenFIle(String filename){
        File[] hiddenFiles = new File(filename).listFiles(File::isHidden);
        System.out.println("隐藏文件或者文件夹如下：");
        for (File file:hiddenFiles){
            System.out.println(file);
        }
    }

}
