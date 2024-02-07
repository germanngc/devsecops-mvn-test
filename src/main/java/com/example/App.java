package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Simple Calculator (addition only)" );

        if ( args.length != 2) {
            System.out.println( "Usage: App <num1> <num2>" );
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);
        double result = add(num1, num2);

        System.out.println( "Result: " + result );
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
}
