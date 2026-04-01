package service;

import model.Account;
import java.util.Scanner;

public class ATMService {

    private Account account;
    private Scanner scanner;

    public ATMService(Account account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void start() {

        int choice;

        do {

            System.out.println("\nATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Exiting ATM...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 4);
    }
}
