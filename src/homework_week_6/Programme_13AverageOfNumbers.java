package homework_week_6;

import java.util.Scanner;

/**
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */

public class Programme_13AverageOfNumbers {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: " );
        double x = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double y = sc.nextDouble();
        System.out.println("Enter the third number: ");
        double z = sc.nextDouble();
        averageOfThreeNumbers(x, y, z);
        //closing the scanner object
        sc.close();
    }
    //Calculate the average of three numbers
    public static void averageOfThreeNumbers(double a, double b, double c){
        double average = (a + b + c) / 3;
        System.out.println("The average of " + a + " , " + b + " and " + c + " is: " + average);
    }
}
