package iuh.fit.se;

import java.util.Scanner;

/**
 * Main entry class
 * 
 * @author: Mai The Hao
 * @version: 1.0
 * @created: 29-Aug-2025 10:18:00 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = 0, width = 0;
        while (true) {
            System.out.print("Enter height: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height > 0)
                    break;
                else
                    System.out.println("Height must be positive.");
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Enter width: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width > 0)
                    break;
                else
                    System.out.println("Width must be positive.");
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Rectangle: " + rectangle.toString());

        scanner.close();
    }
}
