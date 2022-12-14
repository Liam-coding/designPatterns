package factory.BridgePattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 4:53 PM
 */
public class LargeCoffee extends RefinedCoffee {

    public LargeCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    @Override
    public void orderCoffee(int count) {
        additives.addSomething();
        System.out.println("大杯咖啡" + count + "杯");
    }
}