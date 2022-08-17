package factory.factoryMethodPatterns;

import factory.AProduct;
import factory.IProduct;

/**
 * @Author: Liam
 * @Date: 8/17/2022 1:50 PM
 */
public class AFactory implements IFactory {
    public IProduct getProduct() {
        return new AProduct(AProduct.class.getName());
    }
}
