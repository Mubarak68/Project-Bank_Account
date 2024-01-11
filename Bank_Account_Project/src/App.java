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
                BankAccount myAccount = new BankAccount(accountNumber);
                singleton1.setBankAccount(accountNumber);
                user1.getAccount();

                System.out.println("Enter your username: ");
                String user1Scanner = scanBankAccount.nextLine();
                singleton1.setUsername(accountNumber);
                user1.getUsername();

                System.out.println("Enter password: ");
                String passwordScanner = scanBankAccount.nextLine();
                singleton1.setPassword(accountNumber);
                user1.getPassword();

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
                System.out.println(
                        "Error " + e.getMessage() + "\n"
                                + "Sorry the account number, username, or password is wrong. ");

            }
        }
        System.out.println("Do you want to make a new account ? ");
        Scanner answerKey = new Scanner(System.in);
        boolean answerScanner = answerKey.nextBoolean();
        if (answerScanner) {
            System.out.println("Enter your account number: ");
            String number = answerKey.nextLine();
            BankAccount newBankAccount1 = new BankAccount(number);
            UserClass user2 = new UserClass("User2", "paasword", newBankAccount1);
            BankSingleton singleton2 = BankSingleton.getInstance();

        }
        scanBankAccount.close();

    }
}