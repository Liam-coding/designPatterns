package factory.proxyPattern.cglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Liam
 * @Date: 8/18/2022 2:59 PM
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("JDK动态代理,监听开始!");
        Object result = method.invoke(target, objects);
        System.out.println("JDK动态代理,监听结束!");
        return result;
    }

    public UserManager getCglibProxy(Object targetObject) {
        this.target = targetObject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback(this);
        UserManager result = (UserManager) enhancer.create();
        return result;
    }
}
