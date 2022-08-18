package factory.proxyPattern.dynamicProxy;

import factory.proxyPattern.dynamicProxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: Liam
 * @Date: 8/18/2022 2:33 PM
 */
public class ProxyTest {

    public static void main(String[] args) {
        Person lisi = new Student("lisi");

        InvocationHandler stuHandler = new StuInvocationHandler<Person>(lisi);
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class<?>[]{Person.class}, stuHandler);

        stuProxy.givenMoney();

    }

}
