/** *****************************************************************
 conversion.java
 Converts various measures from one unit to another

 @author Jeff Offutt & Ren Li

 @version 1.0    October 2000
 @version 2.0    June 2015
 @version 2.1    January 2020
  ********************************************************************* */
//Names : Kevin Nguyen and Kosei Matsuda
// Import Servlet Libraries


// Import Java Libraries
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;
// conversion class

public class conversion
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String choice;
        String choice2;
        
        float num1;
        num1 = Float.valueOf (3);
        num1 = (float) (num1 * 2.54);
        while(true)
        {
            choice = printMenu();
            if (choice.equals("1"))
            {
                System.out.println("1. Fahrenheit to Celcius \n2. Celcius to Fahrenheit");
                choice2 = s.next();
                if (choice2.equals("1"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertF2C(s.next()));
                }
                else if (choice2.equals("2"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertC2F(s.next()));
                }
                else
                {
                    System.out.println("Please input either 1 or 2");
                }
            }
            else if (choice.equals("2"))
            {
                System.out.println("1. Inch to Centimeters \n2. Centimeters to Inch");
                choice2 = s.next();
                if (choice2.equals("1"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertIn2Cm(s.next()));
                }
                else if (choice2.equals("2"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertCm2In(s.next()));
                }
                else
                {
                    System.out.println("Please input either 1 or 2");
                }
            }
            else if (choice.equals("3"))
            {
                System.out.println("1. Feet to Meters \n2. Meters to Feet");
                choice2 = s.next();
                if (choice2.equals("1"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertF2M(s.next()));
                }
                else if (choice2.equals("2"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertM2F(s.next()));
                }
                else
                {
                    System.out.println("Please input either 1 or 2");
                }
            }
            else if (choice.equals("4"))
            {
                System.out.println("1. Mile to Kilometer \n2. Kilometer to Mile");
                choice2 = s.next();
                if (choice2.equals("1"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertM2K(s.next()));
                }
                else if (choice2.equals("2"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertK2M(s.next()));
                }
                else
                {
                    System.out.println("Please input either 1 or 2");
                }
            }
            else if (choice.equals("5"))
            {
                System.out.println("1. Gallon to Liter \n2. Liter to Gallon");
                choice2 = s.next();
                if (choice2.equals("1"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertG2L(s.next()));
                }
                else if (choice2.equals("2"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertL2G(s.next()));
                }
                else
                {
                    System.out.println("Please input either 1 or 2");
                }
            }
            else if (choice.equals("6"))
            {
                System.out.println("1. Ounce to Gram \n2. Gram to Ounce");
                choice2 = s.next();
                if (choice2.equals("1"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertOz2G(s.next()));
                }
                else if (choice2.equals("2"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertG2Oz(s.next()));
                }
                else
                {
                    System.out.println("Please input either 1 or 2");
                }
            }
            else if (choice.equals("7"))
            {
                System.out.println("1. Pound to Kilogram \n2. Kilogram to Pound");
                choice2 = s.next();
                if (choice2.equals("1"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertK2Lb(s.next()));
                }
                else if (choice2.equals("2"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertLb2K(s.next()));
                }
                else
                {
                    System.out.println("Please input either 1 or 2");
                }
            }
            else if (choice.equals("8"))
            {
                System.out.println("1. Miles per hour to Kilometers per hour \n2. Kilometers per hour to Miles per hour");
                choice2 = s.next();
                if (choice2.equals("1"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertMph2Kph(s.next()));
                }
                else if (choice2.equals("2"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertKph2Mph(s.next()));
                }
                else
                {
                    System.out.println("Please input either 1 or 2");
                }
            }
            else if (choice.equals("9"))
            {
                System.out.println("1. Kelvin to Celsius \n2. Celsius to Kelvin ");
                choice2 = s.next();
                if (choice2.equals("1"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertKel2Cel(s.next()));
                }
                else if (choice2.equals("2"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertCel2Kel(s.next()));
                }
                else
                {
                    System.out.println("Please input either 1 or 2");
                }
            }
            else if (choice.equals("10"))
            {
                System.out.println("1. Miles per gallon to Kilometers per Liter \n2. Kilometers per liter to Miles per gallon");
                choice2 = s.next();
                if (choice2.equals("1"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertMpg2Kpl(s.next()));
                }
                else if (choice2.equals("2"))
                {
                    System.out.printf("This is the converted value: " + decimalPlace() + "%n",convertKpl2Mpg(s.next()));
                }
                else
                {
                    System.out.println("Please input either 1 or 2");
                }
            }
            else if (choice.equals("11"))
            {
                  System.exit(0);
            }
            else
            {
                System.out.println("Please give a valid input. (1 through 11");
            }
        }
    }
    /** *****************************************************
     *  Conversion methods below
     *  14 methods, 2 for each pair of units
     ********************************************************* */
     static String printMenu(){
        System.out.println("What type of conversion would you like to make? Input the correlating number. \n 1. Temperature \n 2. Inch/Centimeter  \n 3. Feet/Meter \n 4. Mile/Kilometer \n 5. Gallon/Liter \n 6. Ounce/Gram \n 7. Pound/Kilogram \n 8. Miles Per Hour/Kilometers Per Hour \n 9. Kelvin to Celsius/Celsius to Kelvin \n 10. Exit");
        Scanner scan = new Scanner (System.in);
        String s = scan.next();
        return s;
    }
     static String decimalPlace()
    {
        Scanner scan = new Scanner(System.in);
        System.out.printf("How many digits would you like to set past the decimal? 0 - 4");
        return "%." + scan.next() + "f";
    }
    static float convertF2C (String FAsStr)
    {  // Convert farenheit to celsius
        float num1; // temporary variable
        num1 = Float.valueOf(FAsStr); //converts the inputString to a float
        return (float) ( ( (num1-32.0) * 5.0) / 9.0); //conversion
    }

     static float convertC2F (String CAsStr)
    {  // Convert celsius to farenheit
        float num1;
        num1 = Float.valueOf (CAsStr);
        return (float) ( (num1 * 9.0 / 5.0) + 32.0);
    }

    // small distance
    public static float convertIn2Cm (String inAsStr)
    {  // Convert inches to centimeters
        float num1;
        num1 = Float.valueOf (inAsStr);
        return (float) (num1 * 2.54);
    }

     static float convertCm2In (String cmAsStr)
    {  // Convert centimeters to inches
        float num1; // temporary variables
        num1 = (Float.valueOf (cmAsStr));
        return (float) (num1 * 0.3937);
    }

    // medium distance
     static float convertF2M (String ftAsStr)
    {  // Convert feet to meters
        float num1;
        num1 = (Float.valueOf (ftAsStr));
        return (float) (num1 * 0.3048);
    }

     static float convertM2F (String mAsStr)
    {  // Convert meters to feet
        float num1;
        num1 = (Float.valueOf (mAsStr));
        return (float) (num1 / 0.6048);
        // Back to 2 digits
    }

    // large distance
     static float convertM2K (String miAsStr)
    {  // Convert miles to kilometers
        float num1;
        num1 = (Float.valueOf (miAsStr));
        return (float) (num1 * 1.609);
    }

     static float convertK2M (String kmAsStr)
    {  // Convert kilometers to miles
        float num1;
        num1 = (Float.valueOf (kmAsStr));
        return (float) (num1 * 0.6214);
    }

    // volume
     static float convertG2L (String galAsStr)
    {  // Convert gallons to liters
        float num1;
        num1 = (Float.valueOf (galAsStr));
        return (float) (num1 * 3.785);
    }

     static float convertL2G (String LAsStr)
    {  // Convert liters to gallons
        float num1;
        num1 = (Float.valueOf (LAsStr));
        return (float) (num1 / 3.785);
    }

    // small weight
     static float convertOz2G (String ozAsStr)
    {  // Convert ounces to grams
        float num1;
        num1 = (Float.valueOf (ozAsStr));
        return (float) (num1 * 28.35);
    }

     static float convertG2Oz (String gAsStr)
    {  // Convert grams to ounces
        float num1;
        num1 = (Float.valueOf (gAsStr));
        return (float) (num1 / 28.35);
        // Back to 2 digits
    }

    // medium weight
     static float convertLb2K (String lbAsStr)
    {  // Convert pounds to kilograms
        float num1;
        num1 = (Float.valueOf (lbAsStr));
        return (float) (num1 * 0.4536);
    }

     static float convertK2Lb (String kgAsStr)
    {  // Convert kilograms to pounds
        float num1;
        num1 = (Float.valueOf (kgAsStr));
        return (float) (num1 * 2.205);
    }
    
     static float convertMph2Kph (String mphAsStr)
    {  // Convert mph to kph
        float num1;
        num1 = (Float.valueOf (mphAsStr));
        return (float) (num1 * 1.609344);
    }
    
     static float convertKph2Mph (String kphAsStr)
    {  // Convert kph to mph
        float num1;
        num1 = (Float.valueOf (kphAsStr));
        return (float) (num1 * 0.621371);
    }
     
     static float convertKel2Cel (String kphAsStr)
     {  // Convert kelvin to celsius
         float num1;
         num1 = (Float.valueOf (kphAsStr));
         return (float) (num1 - 273.15);
     }
     
     static float convertCel2Kel (String kphAsStr)
     {  // Convert celsius to kelvin
         float num1;
         num1 = (Float.valueOf (kphAsStr));
         return (float) (num1 + 273.15);
     }
     public static float convertMpg2Kpl (String kphAsStr)
     {  // Convert mpg to kpl
         float num1;
         num1 = (Float.valueOf (kphAsStr));
         return (float) (num1 * 0.425144);
     }
     public static float convertKpl2Mpg (String kphAsStr)
     {  // Convert kpl to mpg
         float num1;
         num1 = (Float.valueOf (kphAsStr));
         return (float) (num1 * 2.35215);
     }
}