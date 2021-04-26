package W3_P1_T2;

public   class Pay {
    public static double money = 100.0;
   public  void payway(double x){
       money -= x;
       System.out.println("现金支付" + x + "元，余额" + money + "元");
   }
}

