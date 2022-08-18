package factory.DecoratorPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 11:03 AM
 */
/**
 * 加糖 两元
 */
public class Sugar extends Decorator{
    public Sugar(Coffee coffee) {
        super(coffee);
        System.out.println("增加糖 2元");
    }
    public double cost(){
        return super.cost() + 2;
    }
}