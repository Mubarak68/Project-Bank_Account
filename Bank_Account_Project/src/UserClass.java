public class UserClass {

    private String username;
    private String password;
    private BankAccount bankAccount;

    public UserClass(String username, String password, BankAccount bankAccount) {
        this.username = username;
        this.password = password;
        this.bankAccount = bankAccount;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        String username1 = this.username;
        if (username.equals(username1)) {
            System.out.println("The username is correct");
        } else {
            System.out.println("The username is incorrect");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        String password1 = this.password;
        if (password.equals(password1)) {
            System.out.println("The password is correct");
        } else {
            System.out.println("The password is incorrect");
        }
    }

    public BankAccount getAccount() {
        return bankAccount;
    }

    public void setAccount(BankAccount account) {
        this.bankAccount = account;
        BankAccount account1 = this.bankAccount;
        if (account1 == account) {
            System.out.println("The account number is correct");
        } else {
            System.out.println("The account number is incorrect");
        }
    }

}
