package factory.abstructFactoryPatterns;

/**
 * @Author: Liam
 * @Date: 8/17/2022 2:17 PM
 */
public class Test0001 {
    public static void main(String[] args) {
        Foo foo = new Foo(new IFactory<String>(){
            String s;

            public String getS() {
                return s;
            }

            public String create(){
                s = "aaaa";
                return new String("1212313");
            }
        });
        String t = (String)foo.getT();
        System.out.println(t);
    }
}
