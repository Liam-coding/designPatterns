package factory.Adapter;

/**
 * @Author: Liam
 * @Date: 8/17/2022 3:15 PM
 */
public class AdapterDemo {
    public static void main(String[] args){
        Android android = new Adapter(new Iphone());
        //调用的是安卓的接口，但实际上
        //确实一个可以接受苹果充电器的接口
        android.isAndroid();
    }
}
