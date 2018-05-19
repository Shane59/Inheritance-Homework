import java.awt.*;
/*
 * Shinya Aoi
 * InheritanceHW
 * 05/02/2018
 */

/**
 * This class is to print a shpae of tree.
 */
public class Tree extends Shape {
    private int height;
    private int myColor;

    /**
     * A constructor to take three parameters.
     * @param a which is a point of x
     * @param b which is a point of y
     * @param h which is height
     */
    public Tree(int a, int b,int myColor, int h){
        super(a,b, myColor);
        height = h;
    }

    /**
     * This method to get area of the shape.
     * @return area
     */
    public double getArea(){
        return (double)(height*height/2/2 + height/3*height/2);
    }

    /**
     * This method draws the shape.
     * @param g which is Graphic
     */
    public void draw(Graphics g){
        final int x = getX();
        final int y = getY();

        int[] xPoints = {x+height/2, x, x+height};
        int[] ypoints = {y, y+height/2,y+height/2};
        g.setColor(Color.green);
        g.fillPolygon(xPoints,ypoints,3);

        Color myColor = new Color(165,42,42);
        g.setColor(myColor);
        g.fillRect(x+height/3, y+height/2, height/3, height/2);
    }

    /**
     * A getter to get height
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * A setter to set height
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }
}
