package W3_P1_T1;
//复数对象的设计

public class W3_P1_T1_TEST {
    // 复数类的测试
    public static void main(String[] args) {

        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(4, 6);
        System.out.println("number1:  " + number1.tostr());
        System.out.println("number2:  " + number2.tostr());
        System.out.println("number1+nuber2  = " + number1.add(number2).tostr());
    }

}