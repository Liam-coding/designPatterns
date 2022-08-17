package factory.factoryMethodPatterns;

import factory.BProduct;
import factory.IProduct;

/**
 * @Author: Liam
 * @Date: 8/17/2022 1:50 PM
 */
public class BFactory implements IFactory {
     public IProduct getProduct() {
        return new BProduct(BProduct.class.getName());
    }
}
