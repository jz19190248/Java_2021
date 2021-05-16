
import java.util.*;

public class PayTest {
    public static void main(String[] args) {
        Pay pay;
        pay = new PayByAliPay();
        pay.show();
        pay.payway(20.0);
        pay.show();

        pay = new PayByCash();
        pay.show();
        pay.payway(10.0);
        pay.show();
    }
}
