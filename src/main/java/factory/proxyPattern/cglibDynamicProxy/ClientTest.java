package factory.proxyPattern.cglibDynamicProxy;

/**
 * @Author: Liam
 * @Date: 8/18/2022 3:06 PM
 */
public class ClientTest {

    public static void main(String[] args) {

        JdkProxy jdkProxy = new JdkProxy();
        UserManager jdkProxyJDKProxy = (UserManager) jdkProxy.getJDKProxy(new UserManagerImpl());
        jdkProxyJDKProxy.addUser("admin","123456");

        CglibProxy cglibProxy = new CglibProxy();
        UserManager clibProxyUserManager = cglibProxy.getCglibProxy(new UserManagerImpl());
        clibProxyUserManager.addUser("admin","123456");


    }

}
