package iuh.fit.se;

/**
 * Represents a rectangle with width and height.
 * 
 * @author Mai The Hao
 * @version 1.0
 * @since 2025-08-29
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", area=" + getArea() + ", perimeter="
                + getPerimeter() + "]";
    }
}
