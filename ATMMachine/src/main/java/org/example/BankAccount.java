package org.example;

public class BankAccount {
    private double balance;

    BankAccount(){}
     BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " Deposit successful.");
        } else {
            System.out.println(" Invalid amount for deposit");
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Withdrawn successful.");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdraw. ");
        }
        return balance;
    }

}
