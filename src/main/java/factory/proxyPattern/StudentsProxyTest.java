package factory.proxyPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 1:35 PM
 */
public class StudentsProxyTest {
    public static void main(String[] args) {
        //这里只用到了静态代理,由程序员创建或特定工具自动生成源代码，
        // 也就是在编译时就已经将接口、被代理类、代理类等确定下来。
        // 在程序运行之前，代理类的.class文件就已经生成。
        Student zhangsan = new Student("zhangsan");
        StudentsProxy proxy = new StudentsProxy(zhangsan);
        proxy.givenMoney();
    }
}
