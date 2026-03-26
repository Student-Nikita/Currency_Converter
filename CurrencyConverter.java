import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double amount, result;

        System.out.println("Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter amount: ");
        amount = sc.nextDouble();

        if (choice == 1) {
            result = amount * 83;
            System.out.println("Converted amount in INR = " + result);
        } 
        else if (choice == 2) {
            result = amount / 83;
            System.out.println("Converted amount in USD = " + result);
        } 
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}