package day17;

import java.util.Scanner;

public class SimpleBankManagementSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	     
	        BankAccount bankAccount = new BankAccount();

	        System.out.println("Enter Account Number:");
	        String accountNumber = scanner.nextLine();
	        System.out.println("Enter Account Holder Name:");
	        String accountHolderName = scanner.nextLine();
	        System.out.println("Enter Initial Account Balance:");
	        double accountBalance = scanner.nextDouble();
	        System.out.println("Enter a 4-digit PIN:");
	        int pin = scanner.nextInt();
	        scanner.nextLine();  

	       
	        bankAccount.setAccountDetails(accountNumber, accountHolderName, accountBalance, pin);

	        int choice;
	        do {
	            System.out.println("\n--- Bank Menu ---");
	            System.out.println("1. Display Account Details");
	            System.out.println("2. Deposit Amount");
	            System.out.println("3. Withdraw Amount");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                
	                    bankAccount.displayAccountDetails();
	                    break;
	                case 2:
	                
	                    System.out.print("Enter deposit amount: ");
	                    double depositAmount = scanner.nextDouble();
	                    bankAccount.deposit(depositAmount);
	                    break;
	                case 3:
	                   
	                    System.out.print("Enter PIN: ");
	                    int enteredPin = scanner.nextInt();
	                    System.out.print("Enter withdrawal amount: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    bankAccount.withdraw(withdrawAmount, enteredPin);
	                    break;
	                case 4:
	                    System.out.println("Exiting system...");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        } while (choice != 4);

	        scanner.close();
	    }
	}


