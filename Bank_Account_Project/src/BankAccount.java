public class BankAccount {
    private int accountNumber;
    private double balance;
    private int transactionHistory;
    private double deposit;
    private double withdrawal;

    public BankAccount(int accountNumber, double balance, int transactionHistory) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(int transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    // public double deposit() {
    // double amount = 0;
    // balance += amount;
    // return balance;
    // }

    // public double withdrawal() {
    // return balance;
    // }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
        balance += deposit;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
        balance -= withdrawal;
    }

}
