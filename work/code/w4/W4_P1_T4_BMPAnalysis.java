import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * 完成这道题目其实挺艰难的，尽管做出来以后会发现这道题目并不难，但是在完成的过程中自己踩了几个坑
 * 首先，我现实选用了InputStream直接操作，读入byte数组，这里注意读入byte数组的时候是对数组进行追加写，而不是覆盖写，但是发现byte数组转int没有这个操作
 * 于是想到了使用DataInputStream操作，但是写完以后才发现DataInputStream使用的是大端方式，读出来的数特别大，
 * 所以，最后又被迫自己写了几个大小端转化的函数，
 * 其实写的麻烦了，直接写一个byte2int的函数就可以了
 * 多折腾，多收获。
 * 此外，主义bytep[]直接使用toString()时，打印的事首地址，而不是内容！不可以想当然！
 */

public class W4_P1_T4_BMPAnalysis {

    private  static  final String FILE_Name = "T4_test.bmp";

    public static void main(String[] args)
    {
        String content=null;
        int count=0;
        try {
            int size=0;
            //定义一个字节缓冲区,该缓冲区的大小根据需要来定义
            byte[] buffer_2=new byte[2];
            byte[] buffer_4=new byte[4];

            FileInputStream file = new FileInputStream(FILE_Name);
            DataInputStream dis = new DataInputStream(file);
            System.out.println("解析文件：");
            dis.read(buffer_2,0,2);
            System.out.println("bfType: "+(new String(buffer_2)));
            System.out.println("bfSize: "+ Int2Bytes_LE( dis.readInt()));
            System.out.println("bfReserved1: "+bit_to_small(dis.readShort()));
            System.out.println("bfReserved2: "+bit_to_small(dis.readShort()));
            System.out.println("bfOffBits: "+Int2Bytes_LE( dis.readInt())+"\n");

            System.out.println("解析信息头:");
            System.out.println("biSize: "+Int2Bytes_LE( dis.readInt()));
            System.out.println("biWidth: "+Int2Bytes_LE( dis.readInt()));
            System.out.println("biHeight: "+Int2Bytes_LE( dis.readInt()));
            System.out.println("biPlanes: "+bit_to_small(dis.readShort()));
            System.out.println("biBitCount: "+bit_to_small(dis.readShort()));
            System.out.println("biCompression: "+Int2Bytes_LE( dis.readInt()));
            System.out.println("biSizeImage: "+Int2Bytes_LE( dis.readInt()));
            System.out.println("biXpelsPexMeter: "+Int2Bytes_LE( dis.readInt()));
            System.out.println("biYpelsPexMeter: "+Int2Bytes_LE( dis.readInt()));
            System.out.println("biCirUsed: "+Int2Bytes_LE( dis.readInt()));
            System.out.println("biCirImportant: "+Int2Bytes_LE( dis.readInt()));
            System.out.println("解析完成");
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static  int Int2Bytes_LE(int iValue){
        byte[] rst = new byte[4];
        rst[0] = (byte)(iValue & 0xFF);
        rst[1] = (byte)((iValue & 0xFF00) >> 8 );
        rst[2] = (byte)((iValue & 0xFF0000) >> 16 );
        rst[3] = (byte)((iValue & 0xFF000000) >> 24 );
        return rst[0]|rst[1]|rst[2]|rst[3];
    }
    public static short bit_to_small(short svlaue){
        byte[] bytes = new byte[2];
        bytes[0] = (byte) (svlaue & 0xFF);
        bytes[1] = (byte)( (svlaue & 0xFF00)>>8);
        return (short)(bytes[0]|bytes[1]);
    }

}

