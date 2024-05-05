package main.java.com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hamid Khatami (khatami@caspco.ir)
 * @version 1.0 2024.0505
 * @since 1.0
 */
public class Drawing implements Shape {
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw(String fillColor) {
        for (Shape sh : shapes) {
            sh.draw(fillColor);
        }
    }

    //adding shape to drawing
    public void add(Shape s) {
        shapes.add(s);
    }

    //removing shape from drawing
    public void remove(Shape s) {
        shapes.remove(s);
    }

    //removing aa the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }

}
