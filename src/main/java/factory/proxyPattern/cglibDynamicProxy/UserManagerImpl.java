package factory.proxyPattern.cglibDynamicProxy;

/**
 * @Author: Liam
 * @Date: 8/18/2022 2:52 PM
 */
public class UserManagerImpl implements UserManager {
    public void addUser(String userName, String password) {
        System.out.println("调用了用户新增的方法!");
        System.out.println("传入参数: username" + userName + ",password=" + password);
    }

    public void delUser(String name) {
        System.out.println("调用了删除的方法!");
        System.out.println("传入的参数是:" + name);
    }
}
