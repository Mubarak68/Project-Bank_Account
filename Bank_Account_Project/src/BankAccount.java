import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionHistory;
    private static BankAccount instance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount));
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdrawal", amount));
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public double getBalance() {
        return balance;
    }

    public static BankAccount getInstance() {
        if (instance == null) {
            instance = new BankAccount(null);
        }
        return instance;
    }
}