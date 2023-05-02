package main.java.com.pattern.factory.factorymethod.shape;

public class ShapeRunner {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape= shapeFactory.getShape("Circle");
        shape.draw();



    }
}
