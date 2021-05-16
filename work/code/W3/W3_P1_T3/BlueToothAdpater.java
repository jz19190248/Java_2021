

public class BlueToothAdpater {
    private static BlueToothAdpater instance = new BlueToothAdpater();

    private BlueToothAdpater() {
        System.out.println("构造函数被调用");
    }

    public static BlueToothAdpater getInstance() {
        return instance;
    }

    public void show() {
        System.out.println("类已经创建");
    }

}
