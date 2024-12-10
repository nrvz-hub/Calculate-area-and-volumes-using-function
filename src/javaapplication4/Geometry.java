/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

public class Geometry {
    
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    public static double rectangleArea(double length, double width) {
        return length * width;
    }
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    public static double calculateTriangleSide(double a, double b, double angleC) {
        double angleCRadians = Math.toRadians(angleC);
        double cSquared = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(angleCRadians);
        if (cSquared <= 0) {
            System.out.println("Invalid triangle. The sides do not form a valid triangle.");
            return -1; 
        }
        return Math.sqrt(cSquared);
    }
    public static double calculateCircleSegmentArea(double radius, double angleTheta) {
        double angleThetaRadians = Math.toRadians(angleTheta);
        return (Math.pow(radius, 2) / 2) * (angleThetaRadians - Math.sin(angleThetaRadians));
    }
    public static void main(String[] args) {
        boolean repeat = true;
        
            try (Scanner scanner = new Scanner(System.in)) {
            while(repeat){
            System.out.println("Choose an option:");
            System.out.println("1. Calculate the area of a 2D shape");
            System.out.println("2. Calculate the volume of a 3D object");
            System.out.println("3. Calculate the third side of a triangle using the Law of Cosines");
            System.out.println("4. Calculate the area of a circle segment");
            
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Choose a shape:");
                    System.out.println("1. Circle");
                    System.out.println("2. Rectangle");
                    System.out.println("3. Triangle");
                    int shapeOption = scanner.nextInt();
                    
                switch (shapeOption) {
                    case 1 ->                         {
                            System.out.print("Enter the radius: ");
                            double radius = scanner.nextDouble();
                            double area = circleArea(radius);
                            System.out.println("The area of the circle is: " + area);
                            break;
                        }
                    case 2 ->                         {
                            System.out.print("Enter the length: ");
                            double length = scanner.nextDouble();
                            System.out.print("Enter the width: ");
                            double width = scanner.nextDouble();
                            double area = rectangleArea(length, width);
                            System.out.println("The area of the rectangle is: " + area);
                            break;
                        }
                    case 3 ->                         {
                            System.out.print("Enter the base: ");
                            double base = scanner.nextDouble();
                            System.out.print("Enter the height: ");
                            double height = scanner.nextDouble();
                            double area = triangleArea(base, height);
                            System.out.println("The area of the triangle is: " + area);
                            break;
                        }
                    default ->
                        System.out.println("Invalid shape choice.");
                    
                }
                }
                case 2 -> {
                    System.out.println("Choose an object:");
                    System.out.println("1. Sphere");
                    System.out.println("2. Cylinder");
                    int objectOption = scanner.nextInt();
                    
                switch (objectOption) {
                    case 1 ->                         {
                            System.out.print("Enter the radius: ");
                            double radius = scanner.nextDouble();
                            double volume = sphereVolume(radius);
                            System.out.println("The volume of the sphere is: " + volume);
                            break;
                        }
                    case 2 ->                         {
                            System.out.print("Enter the radius: ");
                            double radius = scanner.nextDouble();
                            System.out.print("Enter the height: ");
                            double height = scanner.nextDouble();
                            double volume = cylinderVolume(radius, height);
                            System.out.println("The volume of the cylinder is: " + volume);
                        }
                    default -> System.out.println("Invalid object choice.");
                }
                }
                case 3 -> {
                    System.out.print("Enter side a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter side b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Enter angle C (in degrees) between sides a and b: ");
                    double angleC = scanner.nextDouble();
                    double thirdSide = calculateTriangleSide(a, b, angleC);
                    if (thirdSide != -1) {
                        System.out.println("The third side of the triangle is: " + thirdSide);
                    }
                }
                case 4 -> {
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.print("Enter the central angle (in degrees): ");
                    double angle = scanner.nextDouble();
                    double segmentArea = calculateCircleSegmentArea(radius,angle);
                    System.out.println("The area of the circle segment is: " + segmentArea);
                }
                default -> System.out.println("Invalid option! Please choose 1, 2, 3, or 4.");
            }
            
                System.out.print("You want to try again? [1]Yes [2]No:");
                int repeatOption = scanner.nextInt();
                
                switch(repeatOption){
                    case 1 ->{
                        repeat = true;
                    }
                    case 2 ->{
                        repeat = false;
                    }
                    default -> System.out.println("Invalid Input");
                }
        }
        }   
    }
}


