import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        Date toDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy ss:mm:HH");
        System.out.println("The date is: " + toDate);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}