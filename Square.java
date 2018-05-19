import java.awt.*;
/*
 * Shinya Aoi
 * Lab5
 * 05/02/2018
 */
/**
 * This class draws a square.
 */
public class Square extends Shape{
    private double side;

    /**
     * A constructor that takes three parameters
     * @param x which is a point of x
     * @param y which is a point of y
     * @param side which is a side of square
     */
    public Square(int x, int y, double side){
        super(x,y);
        this.side = side;
    }

    /**
     * Override to get area of square
     * @return area of Square
     */
    @Override
    public double getArea(){
        return side*side;
    }

    /**
     * This method draws the shape.
     * @param g which is Graphic
     */
    @Override
    public void draw( Graphics g ){
        final int x = getX();
        final int y = getY();
        g.setColor(Color.green);
        g.drawRect(x,y,(int)side,(int)side);
    }

}
