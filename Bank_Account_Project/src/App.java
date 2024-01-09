public class App {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount1 = new BankAccount(0, 0, 0);
        bankAccount1.setAccountNumber(011017351);
        bankAccount1.setBalance(310827.23);
        bankAccount1.setTransactionHistory(253);
        bankAccount1.setDeposit(2435.876);
        bankAccount1.setWithdrawal(677.12);

        System.out.println("The total balance: " + bankAccount1.getBalance());
        System.out.println("The account number: " + bankAccount1.getAccountNumber());
        System.out.println("The entered depoist is : " + bankAccount1.getDeposit());
        System.out.println("The entered withdrawal amount is : " + bankAccount1.getWithdrawal());
        System.out.println("Transaction history: " + bankAccount1.getTransactionHistory());
        System.out.println("The total balance: " + bankAccount1.getBalance());

    }
}
