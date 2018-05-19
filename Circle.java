import java.awt.*;
/*
 * Shinya Aoi
 * InheritanceHW
 * 05/02/2018
 */

/**
 * This class is to draw circle.
 * This inheritances the Shape class.
 * An instance variable r is radius.
 */
public class Circle extends Shape {
    private double r;

    /**
     * A constructor that takes four parameters.
     * @param a which is a point of x.
     * @param b which is a point of y.
     * @param color as an int.
     * @param r which is radius
     */
    public Circle(int a, int b, int color, double r) {
        super(a, b, color);
        this.r = r;
    }

    /**
     * Getter to get radius
     * @return r which is radius
     */
    public double getRadius(){
        return r;
    }

    /**
     * Setter to set radius
     * @param r which is radius.
     */
    public void setRadius(int r){
        this.r = r;
    }

    /**
     * Getter to get area of circle
     * @return the area of circle
     */
    @Override
    public double getArea(){
        return Math.PI*r*r;
    }

    /**
     * This method is to draw circle
     * @param g which is Graphic
     */
    @Override
    public void draw(Graphics g) {
        final int x = getX();
        final int y = getY();
        g.setColor(myColor);
        g.drawOval(x,y, (int)r,(int)r);
    }
}
