package factory.ComponentPattern;

/**
 * @Author: Liam
 * @Date: 8/17/2022 4:13 PM
 */
public abstract class Component {
    public abstract void operation();

    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    public Component getChild(int i) {
        throw new UnsupportedOperationException();
    }
}

class ConcreteComponent1 extends Component {
    public void operation() {
        System.out.println("operation of concrete component 1 ");
    }
}

class ConcreteComponent2 extends Component {
    public void operation() {
        System.out.println("operation of concrete component 2 ");
    }
}

class ConcreteComponent3 extends Component {
    public void operation() {
        System.out.println("operation of concrete component 3 ");
    }
}
