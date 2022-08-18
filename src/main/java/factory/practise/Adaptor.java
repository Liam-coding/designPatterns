package factory.practise;

/**
 * @Author: Liam
 * @Date: 8/18/2022 10:40 AM
 */
public class Adaptor extends Android{
    private Iphone iphone;
    public Adaptor(Iphone iphone) {
        this.iphone = iphone;
    }

    @Override
    public String addroidDescription() {
        return iphone.iphoneDescription();
    }
}
