package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */

public class Programme_6AreaOfCircle {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        double radius = sc.nextDouble();
        areaOfCircle(radius);
        //closing the scanner object
        sc.close();
    }
    //Calculating the area of circle
    public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is : " +area);
    }
}
