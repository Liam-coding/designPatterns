package factory.chainofResponsibility;

/**
 * @Author: Liam
 * @Date: 8/18/2022 5:12 PM
 */
public abstract class Programmer {
    protected Programmer next;

    public void setNext(Programmer next) {
        this.next = next;
    }

    abstract void handle(Bug bug);
}