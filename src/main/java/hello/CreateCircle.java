package main.java.hello;

import java.util.Scanner;

public class CreateCircle {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] varArgs) {
        Circle circle = new Circle();
        System.out.println("Radius: ");
        double radius = sc.nextInt();
        circle.setRadius(radius);


        Circle circle2 = new Circle();
        System.out.println("Radius: ");
        double radius2 = sc.nextInt();
        circle2.setRadius(radius2);
        System.out.println("Circle 1 is: " + circle2.area() + " and Circle 2 is: " + circle.area());
    }
}
