import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanBankAccount = new Scanner(System.in);
        BankAccount bankAccount1 = new BankAccount("12121");
        UserClass user1 = new UserClass("User", "password", bankAccount1);
        BankSingleton singleton1 = BankSingleton.getInstance();

        while (true) {

            try {
                System.out.print("Enter account number: ");
                String accountNumber = scanBankAccount.nextLine();
                singleton1.setBankAccount(accountNumber);
                user1.getAccount();
                BankAccount myAccount = new BankAccount(accountNumber);
                System.out.println("Enter your username: ");
                singleton1.setUsername(accountNumber);
                user1.getUsername();
                String user1Scanner = scanBankAccount.nextLine();
                System.out.println("Enter password: ");
                singleton1.setPassword(accountNumber);
                user1.getPassword();
                String passwordScanner = scanBankAccount.nextLine();

                if (accountNumber.equals(accountNumber) && passwordScanner.equals(user1.getPassword())
                        && user1Scanner.equals(user1.getUsername())) {
                    myAccount.deposit(4162416);
                    myAccount.withdraw(126571);
                    myAccount.deposit(134);
                    myAccount.withdraw(1233);
                    myAccount.displayTransactionHistory();
                    System.out.println("These are you last trasnsactions. Thank you!!");
                    break;

                } else {
                    throw new Exception("Invalid credentials");

                }
            }

            catch (Exception e) {
                System.out.println("Error " + e.getMessage());

            }
        }
        scanBankAccount.close();

    }
}