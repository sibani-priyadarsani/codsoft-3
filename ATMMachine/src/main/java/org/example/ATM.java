package org.example;

import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner scanner;

    ATM(){}
     ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4 Exit");
    }

    public void execute() {
        int choice;
        do {
            showMenu();
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    break;
                default:
                    System.out.println("Invalid choice please enter a valid option");
            }

        } while (choice != 4);
    }

    private void checkBalance() {
        double balance=account.getBalance();
        System.out.println("Your account balance is: " + balance);
    }

    private void deposit() {
        System.out.print("Enter the  amount to deposit : ");
        double amount = scanner.nextDouble();
        double newBalance = account.deposit(amount);
        System.out.println("Updated balance: " + newBalance);
    }

    private void withdraw() {
        System.out.print("Enter the  amount to withdraw : ");
        double amount = scanner.nextDouble();
        double newBalance = account.withdraw(amount);
        System.out.println("Remaining balance in your account: " + newBalance);
    }

}
