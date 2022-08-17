package factory.abstructFactoryPatterns;

/**
 * @Author: Liam
 * @Date: 8/17/2022 1:52 PM
 */
public class Foo<T> {
    private T t;
    public <F extends IFactory<T>> Foo(F factory){
        // t = new T();
        t = factory.create();
    }

    public T getT() {
        return t;
    }
}
