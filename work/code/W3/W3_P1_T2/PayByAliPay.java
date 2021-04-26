package W3_P1_T2;

public class PayByAliPay extends Pay{
    public  void payway(double x){
        money -= x;
        System.out.println("现金支付" + x + "元，余额" + money + "元");
    }
}
