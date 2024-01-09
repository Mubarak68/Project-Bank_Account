// import java.util.ArrayList;
// import java.util.List;

// public class BankAccount1 {
// private int accountNumber;
// private double balance;
// private List<String> transactionHistory;

// public void BankAccount(int accountNumber, double initialBalance) {
// this.accountNumber = accountNumber;
// this.balance = initialBalance;
// this.transactionHistory = new ArrayList<>();
// }

// public void deposit(double amount) {
// if (amount > 0) {
// balance += amount;
// transactionHistory.add("Deposit: +" + amount);
// } else {
// System.out.println("Invalid deposit amount.");
// }
// }

// public void withdraw(double amount) {
// if (amount > 0 && amount <= balance) {
// balance -= amount;
// transactionHistory.add("Withdrawal: -" + amount);
// } else {
// System.out.println("Invalid withdrawal amount or insufficient funds.");
// }
// }

// public void displayTransactionHistory() {
// System.out.println("Transaction History for Account " + accountNumber + ":");
// for (String transaction : transactionHistory) {
// System.out.println(transaction);
// }
// }

// // Additional methods or getters/setters can be added as needed

// // public static void main(String[] args) {
// // // Example usage:
// // BankAccount myAccount = new BankAccount1("123456789", 1000.0);
// // myAccount.deposit(500.0);
// // myAccount.withdraw(200.0);
// // myAccount.displayTransactionHistory();
// // }
// }