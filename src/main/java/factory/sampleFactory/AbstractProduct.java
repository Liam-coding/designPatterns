package factory.sampleFactory;

/**
 * @Author: Liam
 * @Date: 8/17/2022 11:29 AM
 */
public abstract class AbstractProduct implements IProduct {
    protected void printBefore(){
        System.out.println("before print"); // 这里所公共的实现
    }

    public void print() {

    }
}

