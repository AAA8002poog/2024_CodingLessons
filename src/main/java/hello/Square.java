package main.java.hello;

public class Square {

    private double sideLength;

    public void setSideLength(double newSideLength) {
        sideLength = newSideLength;
    }

    public double area() {
        double squareArea;
        squareArea = sideLength * sideLength;
        return squareArea;
    }

    public double getsidelength() {
        return (sideLength);
    }

    public double getPerimeter() {
        return sideLength * 4;
    }
}