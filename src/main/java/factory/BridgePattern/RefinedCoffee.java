package factory.BridgePattern;

import java.util.Random;

/**
 * @Author: Liam
 * @Date: 8/18/2022 4:51 PM
 */
//下面是一个对抽象化修正的一个类,里面增加了一个品控的方法
public class RefinedCoffee extends Coffee {
    public RefinedCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    public void orderCoffee(int count) {

    }

    public void checkQuality(){
        Random ran=new Random();
        System.out.println(String.format("%s 添加%s",additives.getClass().getSimpleName(),ran.nextBoolean()?"太多":"正常"));
    }
}
