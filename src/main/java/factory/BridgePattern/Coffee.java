package factory.BridgePattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 4:51 PM
 */
public abstract class Coffee {
    protected ICoffeeAdditives additives;

    public Coffee(ICoffeeAdditives additives) {
        this.additives = additives;
    }

    public abstract void orderCoffee(int count);
}
