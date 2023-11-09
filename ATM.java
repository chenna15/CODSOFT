package PROJECTS;
import java.util.Scanner;

public class ATM {
    private Bank userAccount;

    public ATM(Bank userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("Choose an Option in Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void ATM_Operations() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice in between  (1 to 4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    withdraw(withdrawalAmount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exited!! Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice (or) Please enter a number between (1 and 4).");
                    break;
            }
        } while (choice != 4);
    }

    private void withdraw(double amount) {
        if (amount > 0 && userAccount.getBalance() >= amount) {
            userAccount.withdraw(amount);
            System.out.println("Withdrawal successful. Remaining balance in the account: " + userAccount.getBalance());
        } else {
            System.out.println("Invalid withdrawal amount (or) insufficient funds.");
        }
    }

    private void deposit(double amount) {
        if (amount > 0) {
            userAccount.deposit(amount);
            System.out.println("Deposited successfully. New balance: " + userAccount.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private void checkBalance() {
        System.out.println("Current Balance: " + userAccount.getBalance());
    }
}
