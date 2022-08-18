package factory.Adapter;

/**
 * @Author: Liam
 * @Date: 8/17/2022 3:10 PM
 */
//Adapter
public class Adapter extends Android {
    private Iphone iphone;

    public Adapter(Iphone iphone) {
        this.iphone = iphone;
    }

    @Override
    public void isAndroid() {
        iphone.isIphone();
    }
}
