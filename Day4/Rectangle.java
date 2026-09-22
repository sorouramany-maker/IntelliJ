package Day4;

public class Rectangle {
    protected double length;
    protected double width;
    private static int counter = 0;

    // Default Constructor
    public Rectangle() {
        counter++;
    }

    // Parameterized Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        counter++;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public static int getCounter() {
        return counter;
    }
    public double calculatePerimeter() {
        return length * 2 + width * 2;
    }
}