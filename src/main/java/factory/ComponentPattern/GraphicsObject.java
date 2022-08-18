package factory.ComponentPattern;

/**
 * @Author: Liam
 * @Date: 8/17/2022 4:28 PM
 */

//based graph
public abstract class GraphicsObject {
    public abstract void draw();
    public void add(GraphicsObject object) {
        throw new UnsupportedOperationException();
    }
    public void remove(GraphicsObject object) {
        throw new UnsupportedOperationException();
    }
}

class Circle extends GraphicsObject {
    public void draw() {
        System.out.println("draw circle");
    }
}

class Line extends GraphicsObject {
    public void draw() {
        System.out.println("draw line");
    }
}

class Rectangle extends GraphicsObject {
    public void draw() {
        System.out.println("draw rectangle");
    }
}