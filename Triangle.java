/*
 * Shinya Aoi
 * Shape Inheritance HW/Lab5
 * 05/02/2018
 */
import java.awt.*;

/**
 * This class inheritances the Shape class.
 * This class prints out the image of triangle.
 */
public class Triangle extends Shape{
    private int height;

    /**
     * Constructor that takes four parameters.
     * This calls the superclass to set x, y, and color.
     * @param a which is point of x
     * @param b which is point of y
     * @param color as integer
     * @param height
     */
    public Triangle(int a, int b,int color, int height) {
        super(a, b, color);
        this.height = height;
    }

    /**
     * Overriding getArea method from the parent class.
     * @return the area of a triangle.
     */
    @Override
    public double getArea(){
        return height*height/2;
    }

    /**
     * Overriding draw method from the parent class.
     * @param g which is Graphic
     */
    public void draw(Graphics g){
        final int x = getX();
        final int y = getY();
        g.setColor(myColor);
        int[] xPoints = {x+height/2, x, x+height};
        int[] yPoints = {y,y+height,y+height};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    /**
     * Getter for variable height
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter for variable height
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }
}
