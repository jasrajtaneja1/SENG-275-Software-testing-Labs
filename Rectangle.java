/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab02;

import org.w3c.dom.css.Rect;

public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    //basic constructor with no parameters
    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setWidth(int new_width) throws IllegalArgumentException {
        if (new_width <= 0) {
            throw new IllegalArgumentException();
        }
        this.width = new_width;
    }


    public void setHeight(int new_height) throws IllegalArgumentException {

        if (new_height <= 0) {
            throw new IllegalArgumentException();
        }
        this.height = new_height;
    }


    public void setX(int new_x) {
        this.x = new_x;


    }

    public void setY(int new_y) {
        this.y = new_y;

    }


    public boolean equals(Rectangle r)
    {
        boolean result = false;
        result =  (width == r.getWidth()) &&
                (height == r.getHeight()) &&
                (x == r.getX()) &&
                (y == r.getY());


        return result;
    }

    public int getArea(Rectangle r){


        return r.getX()  *  r.getY();
    }

    public boolean rectangleContains(Rectangle r){

        boolean result = false;
        if( (x>r.getX())  && y>r.getY() && width>r.getWidth() && height>getHeight()){
            result = true;
        }
        return true;

    }



}