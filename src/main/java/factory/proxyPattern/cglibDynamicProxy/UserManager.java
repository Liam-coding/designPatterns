package factory.proxyPattern.cglibDynamicProxy;

/**
 * @Author: Liam
 * @Date: 8/18/2022 2:51 PM
 */
public interface UserManager {

    void addUser(String userName, String password);

    void delUser(String name);

}
