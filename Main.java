package PROJECTS;

public class Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of $1000
        Bank userAccount = new Bank(1000);

        // Create an ATM instance connected to the user's bank account
        ATM atm = new ATM(userAccount);

        // Operate the ATM
        atm.operateATM();
    }
}
