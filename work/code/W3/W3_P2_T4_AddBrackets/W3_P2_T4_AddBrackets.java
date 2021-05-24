import java.net.SocketOption;

public class W3_P2_T4_AddBrackets {
    public static void main(String[] args) {
        String str = "ab123ab123";
        String str1 = "ab";
        String substr = "["+str1+"]";
        System.out.println(str.replaceAll(str1,substr));
    }
}