package factory.factoryMethodPatterns;

import factory.sampleFactory.IProduct;

/**
 * @Author: Liam
 * @Date: 8/17/2022 1:49 PM
 */
public interface IFactory {
    IProduct getProduct();
}
