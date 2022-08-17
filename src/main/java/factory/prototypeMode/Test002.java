package factory.prototypeMode;

/**
 * @Author: Liam
 * @Date: 8/17/2022 2:42 PM
 */
public class Test002 {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeDemo prototypeDemo = new PrototypeDemo();
        prototypeDemo.setNum(1L);
//        PrototypeDemo prototypeDemo3 = prototypeDemo;
//        System.out.println(prototypeDemo3.getNum());

//        PrototypeDemo prototypeDemo2 = (PrototypeDemo) prototypeDemo.clone();
//        System.out.println(prototypeDemo2.getNum());

//        System.out.println(prototypeDemo.equals(prototypeDemo2));

        PrototypeDemo prototypeDemo3 = (PrototypeDemo) prototypeDemo.clone();
        System.out.println(prototypeDemo3.getNum());
        System.out.println(prototypeDemo.equals(prototypeDemo3));
    }
}
