package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Programme_7TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        float temp = sc.nextFloat();
        //Object creation
        Programme_7TempConversion t = new Programme_7TempConversion();
        t.convertTempToDegreeCelsius(temp);
        //closing the scanner object
        sc.close();
    }
    //Temperature conversion method
    public void convertTempToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + "degree celsius");
    }
}
