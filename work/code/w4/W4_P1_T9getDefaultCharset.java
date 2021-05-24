import java.nio.charset.Charset;

/**
 *关于字符流所使用的的字符集，应该是由JVM所使用的默认字符集所决定的
 * 而JVM的所使用的字符集则是由系统读取参数file.encoding决定，所以，只需要查看这个变量即可
 *也可以通过Charset.defaultCharset()查看
*/

public class W4_P1_T9getDefaultCharset {
    public static void main(String[] args) {
        final String charset = System.getProperty("file.encoding");
        System.out.println("字符流所使用的默认字符集为:"+charset);
        System.out.println("defaultCharset:"+Charset.defaultCharset());
    }

}
