package factory.chainofResponsibility;

/**
 * @Author: Liam
 * @Date: 8/18/2022 5:15 PM
 */
public class GoodProgrammer extends Programmer{
    void handle(Bug bug) {
        if (bug.value > 50 && bug.value <= 100) {
            solve(bug);
        } else if (next != null) {
            next.handle(bug);
        }
    }

    private void solve(Bug bug) {
        System.out.println("优秀程序员解决了一个难度为 " + bug.value + " 的 bug");
    }
}
