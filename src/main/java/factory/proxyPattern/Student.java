package factory.proxyPattern;

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
        System.out.println(name+"交了班费");
    }
}
