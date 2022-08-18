package factory.ComponentPattern;

/**
 * @Author: Liam
 * @Date: 8/17/2022 4:16 PM
 */
public class Client {
    public static void main(String[] args) {
        Component c1 = new ConcreteComponent1();
        Component c2 = new ConcreteComponent2();
        Component c3 = new ConcreteComponent3();

        Component c = new Composite();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.operation();

        c.remove(c2);
        c.operation();
    }
}
