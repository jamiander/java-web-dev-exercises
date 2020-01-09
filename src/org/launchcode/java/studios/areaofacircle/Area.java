package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double radius;
            System.out.println("Enter a radius: ");
            if (!input.hasNextDouble()) {
                System.out.println("Invalid input");
            } else {
                radius = input.nextDouble();
                if (radius > 0) {
                    Double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                } else {
                    System.out.println("Input is invalid.");
                }
            }

    }
}

