package Homework;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length:");
        double length = scanner.nextDouble();

        System.out.print("Enter the Breadth:");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        System.out.println("Area of rectange is " + area);
        scanner.close();
    }
}
