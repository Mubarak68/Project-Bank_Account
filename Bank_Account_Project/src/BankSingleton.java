public class BankSingleton {

    private static BankSingleton instance;
    private String username;
    private String password;
    private String bankAccount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    private BankSingleton() {

    }

    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }

}