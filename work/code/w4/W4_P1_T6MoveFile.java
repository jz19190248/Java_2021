import java.io.File;
import java.util.Scanner;
public class W4_P1_T6MoveFile {
    public static void main(String[] args) {
        String srcFile,destPath;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要移动的文件夹：");
        srcFile = scanner.next();
        System.out.print("请输入目标文件夹:");
        destPath = scanner.next();
        if(move(srcFile,destPath)){
            System.out.println("移动成功");
        }else{
            System.out.println("移动失败");
        }
    }

    public static boolean move(String srcFile, String destPath) {
        boolean success = false;
        File file = new File(srcFile);
        File dir = new File(destPath);
        if (dir.isDirectory()) {
            success = file.renameTo(new File(dir, file.getName()));
        }else{
            System.out.println(destPath+"不是文件夹");
        }
        return success;
    }
}
