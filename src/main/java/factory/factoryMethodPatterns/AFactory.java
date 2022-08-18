package factory.factoryMethodPatterns;

import factory.sampleFactory.AProduct;
import factory.sampleFactory.IProduct;

/**
 * @Author: Liam
 * @Date: 8/17/2022 1:50 PM
 */
public class AFactory implements IFactory {
    public IProduct getProduct() {
        return new AProduct(AProduct.class.getName());
    }
}
