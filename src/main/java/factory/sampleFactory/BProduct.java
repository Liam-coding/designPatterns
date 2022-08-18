package factory.sampleFactory;

/**
 * @Author: Liam
 * @Date: 8/17/2022 11:31 AM
 */
public class BProduct extends AbstractProduct {
    private String name;
    public BProduct(String name){
        this.name = name;
    }
    @Override
    public void print() {
        this.printBefore();
        System.out.println("print B >>>"+name);
    }
}

