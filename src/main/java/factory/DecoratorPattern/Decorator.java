package factory.DecoratorPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 11:02 AM
 */
public class Decorator implements Coffee{
    private Coffee coffee;
    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }
    public double cost() {
        return coffee.cost();
    }
}