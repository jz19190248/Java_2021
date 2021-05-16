public class PayByAliPay extends Pay{
    public  void payway(double x){
        money -= x;
        System.out.println("支付宝支付" + x + "元，余额" + money + "元");
    }
}
