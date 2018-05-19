import java.awt.*;

/*
 * Shinya Aoi
 * InheritanceHW
 * 05/02/2018
 */

/**
 * This class is to draw a simple pokeball, and
 * this class inheritances the Shape class.
 */
public class SimplePokeBall extends Shape {
    private int radius;

    /**
     * Constructor that takes three parameters.
     * This class calls superclass to set x, y, and radius.
     * @param x which is a point of x
     * @param y which is a point of y
     * @param radius
     */
    public SimplePokeBall(int x, int y, int radius){
        super(x,y,0);
        this.radius = radius;
    }

    /**
     * This method returns the area of a pokeball.
     * @return the area of its area
     */
    public double getArea(){
        return Math.PI*radius*radius;
    }

    /**
     * This method draws a shape of pokeball.
     * @param g which is Graphic
     */
    public void draw(Graphics g){
        final int x = getX();
        final int y = getY();
        int bar = radius/7;

        //Set color and draw a oval for the base of pokeball.
        g.setColor(Color.black);
        g.drawOval(x,y,2*radius,2*radius);

        //Fill the half of pokeball which is top with arc.
        g.setColor(Color.red);
        g.fillArc(x,y,2*radius,2*radius,0,180);

        //Fill the other half of pokeball with arc.
        g.setColor(Color.white);
        g.fillArc(x,y,2*radius,2*radius, 180,180);

        //Fill the center line with rectangle
        g.setColor(Color.black);
        g.fillRect(x,y+radius-bar/2,2*radius,bar);

        //Draw and fill a center circle
        g.setColor(Color.black);
        g.drawOval(x+radius-radius/4,y+radius-radius/4,radius/2, radius/2);
        g.setColor(Color.white);
        g.fillOval(x+radius-radius/4,y+radius-radius/4,radius/2, radius/2);
    }

    /**
     * Getter to return radius
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Setter to set radius
     * @param radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
