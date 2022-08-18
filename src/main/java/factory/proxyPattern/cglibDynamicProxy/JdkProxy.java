package factory.proxyPattern.cglibDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Liam
 * @Date: 8/18/2022 2:54 PM
 */
public class JdkProxy implements InvocationHandler {

    private Object targetObject;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK动态代理,监听开始!");
        Object result = method.invoke(targetObject, args);
        System.out.println("JDK动态代理,监听结束!");
        return result;
    }

    public Object getJDKProxy(Object targetObject) {
        this.targetObject = targetObject;
        Object proxyObject = Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
        return proxyObject;
    }
}
