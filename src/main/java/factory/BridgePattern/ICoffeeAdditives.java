package factory.BridgePattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 4:51 PM
 */
public interface ICoffeeAdditives {
    void addSomething();
}

class Milk implements ICoffeeAdditives {
    public void addSomething() {
        System.out.println("加奶");
    }
}

class Sugar implements ICoffeeAdditives {
    public void addSomething() {
        System.out.println("加糖");
    }
}