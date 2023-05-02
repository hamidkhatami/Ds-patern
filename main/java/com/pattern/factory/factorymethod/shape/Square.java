package main.java.com.pattern.factory.factorymethod.shape;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
