package main.java.hello;

import java.util.Scanner;

public class CreateCircle {

    static Scanner sc     = new Scanner(System.in);
    static Circle  circle = new Circle();

    public static void main(String[] varArgs) {

        System.out.println("Radius: ");
        double radius = sc.nextInt();
        circle.setRadius(radius);
        System.out.println(circle.area());
    }
}
