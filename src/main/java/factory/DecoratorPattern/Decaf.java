package factory.DecoratorPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 11:00 AM
 */
/**
 * 具体组件 --无咖啡因
 * 无咖啡因咖啡 8元
 */
public class Decaf implements Coffee{
    public double cost() {
        return 8;
    }
}