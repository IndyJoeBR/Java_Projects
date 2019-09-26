//  Programmer: Joseph Benson
//  Class: SDEV 200
//  Assignment: M03 Exercise 6.9, 238
//  Program: Conversion between feet and meters

//  PLEASE NOTE:  I don't know where the data for the table on p 238 of the book comes from, but
//                given the feet and the meters to be converted, the conversions are often incorrect.
//                ex.  25.0m converted to feet is 81.975-ft, but the books says 81.967-ft.
//                I have confirmed this both by hand and in a table in Excel.  The results of the
//                calculations in this application seem to conform to the results of my table in Excel
//                and not the book.

public class Main {
    public static void main(String[] args) {

        //  Declare Variables
        double feetForFtoM;
        double convertedToMeters;
        double meterForMtoF;
        double convertedToFeet;

        System.out.println();
        System.out.println("Feet" + " \t \t \t " + "Meters"  + " \t \t " + " | " + " \t \t \t " + "Meters"  + " \t \t " + "Feet");
        System.out.println("__________________________________|_________________________________________");

        // The FOR loop uses the iterate as the feet for conversion and calculates the meters to be converted to feet using
        //    a simple forumla.  It then outputs the results to a table of Feet to Meters and Meters to Feet before repeating.
        for (int i = 1; i < 11; i++) {
            feetForFtoM = i;                                    //  Casts the iteration count to double for feet to be converted and as output
            meterForMtoF = 15.0 + (feetForFtoM * 5.0);          //  Calculates the meters to convert to feet
            convertedToMeters = footToMeter(feetForFtoM);       //  Invokes method to convert from feet to meters
            convertedToFeet = meterToFoot(meterForMtoF);        //  Invokes method to convert from meters to feet

            //  Output is spread across several lines of code to get accurate formatting and 3 digits of precision in meters
            System.out.print(feetForFtoM + " \t \t \t ");
            System.out.printf("%3.3f", convertedToMeters);
            System.out.print(" \t \t \t " + " | " + " \t \t \t ");
            System.out.print(meterForMtoF + " \t \t \t ");
            System.out.printf("%3.3f", convertedToFeet);
            System.out.println();

        }
    }

    //  Convert from feet to meters
    public static double footToMeter(double foot) {
        double result =  foot * 0.305;
        return result;
    }


    //  Convert from meters to feet
    public static double meterToFoot(double meter) {
        double result = meter * 3.279;
        return result;
    }


}