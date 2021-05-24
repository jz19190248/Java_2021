import java.util.Scanner;

public class String_Rverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("请输入字符串：");
        input = scanner.next();
        //"abc123汉字";
        StringBuffer sb =new StringBuffer(input);
        System.out.println("翻转字符串为：  "+sb.reverse());
    }
}
