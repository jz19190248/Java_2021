
public class PayByCash extends Pay {
    public void payway(double x) {
        money -= x;
        System.out.println("现金支付" + x + "元，余额" + money + "元");
    }
}