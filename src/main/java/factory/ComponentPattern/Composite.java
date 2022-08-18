package factory.ComponentPattern;

import java.util.ArrayList;

/**
 * @Author: Liam
 * @Date: 8/17/2022 4:16 PM
 */
public class Composite extends Component {
    private ArrayList<Component> children;

    public Composite() {
        children = new ArrayList<Component>();
    }

    public void operation() {
        for (Component child : children) {
            child.operation();
        }
    }

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public Component getChild(int i) {
        return children.get(i);
    }
}
