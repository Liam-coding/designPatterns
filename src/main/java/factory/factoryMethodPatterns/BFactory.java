package factory.factoryMethodPatterns;

import factory.sampleFactory.BProduct;
import factory.sampleFactory.IProduct;

/**
 * @Author: Liam
 * @Date: 8/17/2022 1:50 PM
 */
public class BFactory implements IFactory {
     public IProduct getProduct() {
        return new BProduct(BProduct.class.getName());
    }
}
