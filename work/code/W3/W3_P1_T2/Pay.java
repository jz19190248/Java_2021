
public class Pay {
    public static double money = 100.0;

    public void payway(double x) {
        money -= x;
        System.out.println("支付" + x + "元，余额" + money + "元");
    }

    public void show() {
        System.out.println("当前余额:" + money);
    }
}
