import java.io.*;

public class W4_P1_T19ComplexSerialize {
    public static void main(String[] args) {
        Complex [] complexes = new Complex[10];
        for(int i = 0 ; i < 10 ;i++){
            complexes[i] = new Complex(i,i+1);
        }
        try{
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("complex.ser"));
            for (int i  = 0 ; i < 10 ;i++){
                oos.writeObject(complexes[i]);
            }
            //System.out.println("序列化成功");
            oos.flush();
            oos.close();
        }catch (IOException e2 ){
            e2.printStackTrace();
        }

        try{
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("complex.ser"));
            Complex complex;
            for (int  i = 0 ; i < 10 ;i++) {
                complex = (Complex) ois.readObject();
                System.out.println(complex);
            }
            //System.out.println("反序列化成功");
            ois.close();
        }
        catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
        catch (IOException e1 ){
            e1.printStackTrace();
        }
    }
}

class Complex implements Serializable {
    private int re;
    private int im;

    //为了测试transient关键字的作用，这里多加了一个没用的变量z，不用管它
    public Complex(int r, int i) {
        this.re = r;
        this.im = i;
    }
    public  Complex(){
        this.re = 0;
        this.im = 0;
    }
    public void setRe(int r ){
        this.re =r;
    }
    public void setIm(int i ){
        this.im =i;
    }
    public String toString() {
        return "(" + re + "i + " + im + "y " +")";
    }
}
