package org.example;

import java.util.Scanner;

public class AtmMachineFunctionality{
    public static void main(String[] args) {
        AtmMachineFunctionality atmMachineFunctionality = new AtmMachineFunctionality();
        atmMachineFunctionality.executeBankingService();
    }

    public void executeBankingService() {
        System.out.println("Welcome to the ATM");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your four Digit pin: ");
        int pin = sc.nextInt();

        BankAccount userAccount = new BankAccount(1000.0);
        ATM atm = new ATM (userAccount);
        atm.execute();
    }
}








