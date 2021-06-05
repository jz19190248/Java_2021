import java.io.File;
import java.util.Scanner;
/**
 * 考察了对File类的使用
 *  这里遇到了一个关于引用传递与值传递的问题引发了思考：在java中没有指针与引用，
 * 所以递归的时候也没有发现返回值使用原值传递是不行的，在没有找到替他替代方式的情况下，我只能用数组的方式去创建，
 * 这种方式很奇怪，可能还需要其他方式处理
 */
public class W4_P1_T5_getChildFileInfo {
    public static void main(String[] args) {
        String parentFilename="D://SQL";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名：");
        //parentFilename = scanner.next();
        File parentFile = new File(parentFilename);
        int[] count = new int[1] ;
        recursion(parentFile,count);
        System.out.println("文件夹"+parentFilename+"下的子文件夹的总数："+getChildFile(parentFile)+
                "   文件总数"+count[0]+"   文件总的空间"+parentFile.length()+"字节");
        scanner.close();
    }
    public static void recursion(File file,int[] i){
        if (file.isDirectory()){
            File [] files = file.listFiles();
            if(files != null){
                for (File file1:files){
                    i[0]++;
                    recursion(file1,i);
                }
            }
        }
    }
    public static int getChildFile(File file){
        int i = 0;
        if (file.isDirectory()){
            File[] files = file.listFiles();
            if(files!=null){
               for(File file1:files){
                   i++;
                }
            }
        }
        return i;
    }
}
