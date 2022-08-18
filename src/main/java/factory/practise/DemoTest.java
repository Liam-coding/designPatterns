package factory.practise;

/**
 * @Author: Liam
 * @Date: 8/18/2022 10:40 AM
 */
public class DemoTest {
    public static void main(String[] args) {
        Android android = new Adaptor(new Iphone());
        System.out.println(android.addroidDescription());
    }
}
