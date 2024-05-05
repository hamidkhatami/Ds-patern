package main.java.com.pattern.composite;

/**
 * @author Hamid Khatami (khatami@caspco.ir)
 * @version 1.0 2024.0505
 * @since 1.0
 */
public class Circle  implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color "+fillColor);
    }
}
