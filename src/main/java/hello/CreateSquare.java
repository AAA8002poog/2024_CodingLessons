package main.java.hello;

import java.util.Scanner;

public class CreateSquare {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] varArgs) {
        Square square = new Square();
        System.out.println("Side length: ");
        double sideLength = sc.nextInt();
        square.setSideLength(sideLength);
        System.out.println(square.area());
    }
}
