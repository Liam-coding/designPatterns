package factory.DecoratorPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 10:58 AM
 */
public class Client {
//    咖啡店里咖啡中可以加不同的配料，摩卡、牛奶、糖、奶泡。
//    手抓饼可以有不同的搭配，可以增加香肠、培根、里脊肉等等，
//    计算增加不同的配料需要多少钱？

//    之前我们讲过策略模式，如果使用策略模式，需要穷举列出所有的组合，种类越多，
//    对于程序员来说是一种灾难性的打击。装饰器模式是一种不错的选择，能够很好的解决问题，
//    增加一种配料或者装饰，只需要增加一个具体的装饰类即可，满足开闭原则。

    //    装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
//    这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。

    /**
     * 买了一杯浓咖啡 加摩卡 加糖
     * 测试类
     */
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        coffee = new Mocha(coffee);
        coffee = new Sugar(coffee);
        System.out.println("一共：" + coffee.cost());
    }


//    优缺点:
//    优点：动态的给一个对象添加一些额外的职责，就扩展功能而言，比生成子类方式更为灵活。
//    缺点：装饰器模式虽然从数量级上减少了类的数量,但是为了要装饰,
//         仍旧会增加很多的小类这些具体的装饰类的逻辑将不会非常的清晰,不够直观,容易令人迷惑。
//    生活中的装饰模式:
//    房子装修，地板可以用瓷砖、木板，冰箱、电视可以使用不同的品牌。
//    房子的主人可以根据自己的喜好，添加不同的装饰品，具有很强的灵活性。
//    服饰搭配，去逛商店，买衣服时，可以搭配不同小饰品，比如眼镜、帽子、围巾等等，
//    有时候你只想买个衬衫，导购员可能会给你推荐一件毛衣，或者一件裤子，让你一起搭配，如果你自己也比较喜欢的话，可能三件都会购买。
}