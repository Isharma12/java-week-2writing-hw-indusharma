package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */

public class Programme_9ConvertUpperCaseToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = sc.nextLine();
        Programme_9ConvertUpperCaseToLowerCase t = new Programme_9ConvertUpperCaseToLowerCase();
        t.convertUpperCaseToLowerCase(uppercase);
        //closing the scanner object
        sc.close();
    }
    //Conversion of Uppercase to Lowercase method
    public void convertUpperCaseToLowerCase(String text){
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
