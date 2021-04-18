package W3_P1_T1;

public class ComplexNumber {
    // @设计一个复数类
    //

    double tru;
    double vir;

    ComplexNumber() {
        tru = 0;
        vir = 0;
    }

    public ComplexNumber(double Tru, double Vir) {
        tru = Tru;
        vir = Vir;
    }

    void setval(double Tru, double Vir) {
        tru = Tru;
        vir = Vir;
    }

    ComplexNumber add(ComplexNumber comnumber) {
        ComplexNumber reslut = new ComplexNumber();
        reslut.tru = this.tru + comnumber.tru;
        reslut.vir = this.vir + comnumber.vir;
        return reslut;
    }

    ComplexNumber multiplication(ComplexNumber comnumber) {
        ComplexNumber reslut = new ComplexNumber();
        reslut.tru = this.tru * comnumber.tru;
        reslut.vir = this.vir * comnumber.vir;
        return reslut;
    }

    ComplexNumber sub(ComplexNumber comnumber) {
        ComplexNumber reslut = new ComplexNumber();
        reslut.tru = this.tru - comnumber.tru;
        reslut.vir = this.vir - comnumber.vir;
        return reslut;
    }

    String tostr() {
        return tru + "+" + vir + "i";
    }

}
