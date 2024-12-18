package day17;


import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private int pin;

    public void setAccountDetails(String accountNumber, String accountHolderName, double accountBalance, int pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit successful! Your new balance is: " + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

  
    public void withdraw(double amount, int enteredPin) {
        if (enteredPin == pin) {
            if (amount <= accountBalance) {
                accountBalance -= amount;
                System.out.println("Withdrawal successful! Your new balance is: " + accountBalance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Incorrect PIN! Withdrawal failed.");
        }
    }

 
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }
}

