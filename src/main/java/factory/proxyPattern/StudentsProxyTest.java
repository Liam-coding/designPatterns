package factory.proxyPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 1:35 PM
 */
public class StudentsProxyTest {
    public static void main(String[] args) {
        Student zhangsan = new Student("zhangsan");
        StudentsProxy proxy = new StudentsProxy(zhangsan);
        proxy.givenMoney();
    }
}
