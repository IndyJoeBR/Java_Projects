import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  Declare patient information
        String firstName;
        String lastName;
        String address1;
        String address2;
        String city;
        String state;
        int zipCode;
        int zipPlus4;
        double amountOwed;
        double paymentAmount;
        String paymentDate;


        //  Prompt the user to enter their information
        System.out.println("Please enter the requested information when prompted.");
        System.out.print("First name: ");
        firstName = input.nextLine();
        System.out.print("Last name: ");
        lastName = input.nextLine();
        System.out.print("Address - 1st line: ");
        address1 = input.nextLine();
        System.out.print("Address - 2nd line: ");
        address2 = input.nextLine();
        System.out.print("City: ");
        city = input.nextLine();
        System.out.print("State: ");
        state = input.nextLine();
        System.out.print("Zip code: ");
        zipCode = input.nextInt();
        System.out.print("Zip+4: ");
        zipPlus4 = input.nextInt();
        System.out.print("Amount Owed: ");
        amountOwed = input.nextDouble();
        System.out.print("Payment Amount: ");
        paymentAmount = input.nextDouble();
        System.out.print("PaymentDate (mm/dd/yyyy): ");
        paymentDate = input.next();



        // Show entries
        System.out.println("\t \t \t \t \t \t \t \t XYZ Community Hospital");
        System.out.println("=====================================================================================================================================================");
        System.out.println("\t Name \t \t \t \t \t Address");
        System.out.println("Last \t \t First \t \t Address Line 1 \t \t City \t \t \t State \t \t Zip \t \t \t \t Amount Owed \t Payment Amt. \t Payment Date");
        System.out.println("=====================================================================================================================================================");
        System.out.println(lastName + "\t \t" + firstName + "\t \t" + address1 + "\t \t" + city + "\t \t" + state + "\t \t" + zipCode + "+" + zipPlus4 + "\t \t \t \t$" + amountOwed + "\t \t \t$" + paymentAmount + "\t \t  " + paymentDate);
        System.out.println("\t \t \t \t \t \t" + address2);


    }
}
