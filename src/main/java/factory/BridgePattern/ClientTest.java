package factory.BridgePattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 4:53 PM
 */
public class ClientTest {
    public static void main(String[] args) {
        //点两杯加奶的大杯咖啡
        RefinedCoffee largeWithMilk = new LargeCoffee(new Milk());
        largeWithMilk.orderCoffee(2);
        largeWithMilk.checkQuality();
    }
}
