package factory;

/**
 * @Author: Liam
 * @Date: 8/17/2022 1:47 PM
 */
public class SimpleFactory {
    //简单工厂模式不利于拓展，违背了**开闭原则**，每次添加一个类，都要修改工厂类
    public static IProduct getProduct(String name){
        if("A".equals(name)){
            return new AProduct(name);
        }else if("B".equals(name)){
            return new BProduct(name);
        }else{
            throw new IllegalArgumentException();
        }
    }
}
