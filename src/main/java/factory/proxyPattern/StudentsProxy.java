package factory.proxyPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 1:33 PM
 */
public class StudentsProxy implements Person {
    Student student;

    public StudentsProxy(Student student){
        //只代理学生对象
        if (Student.class == student.getClass()){
            this.student = student;
        }
    }
    public void givenMoney() {
        System.out.println("班长帮交的");
        student.givenMoney();
    }
}
