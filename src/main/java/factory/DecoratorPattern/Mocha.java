package factory.DecoratorPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 11:02 AM
 */
public class Mocha extends Decorator{
    public Mocha(Coffee coffee) {
        super(coffee);
        System.out.println("增加摩卡 3元");
    }
    public double cost(){
        return super.cost() + 3;
    }
}
