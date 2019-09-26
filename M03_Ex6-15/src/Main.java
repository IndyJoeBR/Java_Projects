//  Programmer: Joseph Benson
//  Class: SDEV 200
//  Assignment: M03 Exercise 6.16, 239
//  Program: Financial Application: print a tax table

//  PLEASE NOTE:  Instead of following Listing 3.5 exactly, I (feel as though) I improved upon it by using the status
//     to change the top income of each tax tier.  The way the tax is determined never (or rarely) changes, so by
//     using the filing status to determine what top end of each tax tier is, it not only shortened the code, but made
//     future updates simpler by only needing to change those numbers in the orderly IF statments.

public class Main {
    public static void main(String[] args) {

        //  Declare Variables
        double taxableIncome;
        int tax;

        //  Prints the table header
        System.out.println("Taxable \t \t \t Single \t \t Married Joint \t \t    Married  \t \t    Head of ");
        System.out.println("Income  \t \t \t        \t \t or Qualifying \t \t    Separate \t \t   Household");
        System.out.println("        \t \t \t        \t \t    Widow(er)  \t \t             \t \t            ");
        System.out.println("___________________________________________________________________________________________");

        //  This FOR loop uses the interate to create the taxable income and then hands it
        //    to a second FOR loop to pass that income to a method to calculate the tax
        //    amount for each status
        for (int i = 50000; i <= 60000; i = i + 50) {               // CHANGE TO 60000 BEFORE COMPLETION
            System.out.print(i);                                  // REMOVE WHEN COMPLETE
            taxableIncome = 1.0 * i;

            //  This loop iterates the taxable income through each category of filing status
            for (int status = 0; status <= 3; status++) {
                tax = (int) Math.round(computeTax(status, taxableIncome));

                //  Outputs each column of the table as the tax is returned from the computeTax method
                System.out.print(" \t \t \t \t ");
                System.out.print(tax);

            }

            // Carriage return at the end of each row
            System.out.println();

        }

    }


    //  Method will calculate tax based on current status
    public static double computeTax(int status, double taxableIncome) {

        // Declare tax rates and the result
        double taxRate1 = 0.0;
        double taxRate2 = 0.0;
        double taxRate3 = 0.0;
        double taxRate4 = 0.0;
        double taxRate5 = 0.0;
        double result;

        // Determine marginal tax rate for each tier by filing status
        //    Note: that while there is a 6th tax tier, it is - effectively - unused.
        if (status == 0) {                              // Filing status: Single
            taxRate1 = 8350.0;
            taxRate2 = 33950.0;
            taxRate3 = 82250.0;
            taxRate4 = 171550.0;
            taxRate5 = 372950.0;
        }
        else if (status == 1) {                         // Filing status: Married Filing Jointly or Qualifying Widow(er)
            taxRate1 = 16700.0;
            taxRate2 = 67900.0;
            taxRate3 = 137050.0;
            taxRate4 = 208850.0;
            taxRate5 = 372950.0;
        }
        else if (status == 2) {                         // Filing status: Married Filing Separately
            taxRate1 = 8350.0;
            taxRate2 = 33950.0;
            taxRate3 = 68525.0;
            taxRate4 = 104425.0;
            taxRate5 = 186475.0;
        }
        else if (status == 3) {                         // Filing status: Head of Household
            taxRate1 = 11950.0;
            taxRate2 = 45500.0;
            taxRate3 = 117450.0;
            taxRate4 = 190200.0;
            taxRate5 = 372950.0;
        }
        else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        // Compute tax for filer
        if (taxableIncome <= taxRate1)
            result = taxableIncome * taxRate1;
        else if (taxableIncome <= taxRate2)
            result = taxRate1 * 0.10 + (taxableIncome - taxRate1) * 0.15;
        else if (taxableIncome <= taxRate3)
            result = taxRate1 * 0.10 + (taxRate2 - taxRate1) * 0.15 + (taxableIncome - taxRate2) * 0.25;
        else if (taxableIncome <= taxRate4)
            result = taxRate1 * 0.10 + (taxRate2 - taxRate1) * 0.15 + (taxRate3 - taxRate2) * 0.25 + (taxableIncome - taxRate3) * 0.28;
        else if (taxableIncome <= taxRate5)
            result = taxRate1 * 0.10 + (taxRate2 - taxRate1) * 0.15 + (taxRate3 - taxRate2) * 0.25 + (taxRate4 - taxRate3) * 0.28 + (taxableIncome - taxRate4) * 0.33;
        else
            result = taxRate1 * 0.10 + (taxRate2 - taxRate1) * 0.15 + (taxRate3 - taxRate2) * 0.25 + (taxRate4 - taxRate3) * 0.28 + (taxRate5 - taxRate4) * 0.33 + (taxableIncome - taxRate5) * 0.35;

        return result;
    }



}