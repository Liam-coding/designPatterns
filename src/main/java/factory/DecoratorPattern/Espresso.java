package factory.DecoratorPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 11:01 AM
 */
public class Espresso implements Coffee{
    public Espresso(){
        System.out.println("1杯浓咖啡 10元");
    }
    public double cost() {
        return 10.0;
    }
}
