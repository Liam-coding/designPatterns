package factory;

/**
 * @Author: Liam
 * @Date: 8/17/2022 11:30 AM
 */
public class AProduct extends AbstractProduct {
    private String name;
    public AProduct(String name){
        this.name = name;
    }
    @Override
    public void print() {
        this.printBefore();
        System.out.println("print A >>>"+name);
    }

}
