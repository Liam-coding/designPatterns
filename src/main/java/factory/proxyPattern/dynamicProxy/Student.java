package factory.proxyPattern.dynamicProxy;

/**
 * @Author: Liam
 * @Date: 8/18/2022 1:32 PM
 */
public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void givenMoney() {
        try {
            //假设数钱花了1秒钟时间
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(name+"交了班费");
    }
}
