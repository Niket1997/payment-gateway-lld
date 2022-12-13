import enums.Currency;
import enums.PaymentMethod;
import models.*;

public class Main {
    public static void main(String[] args) {

        // Create a bank
        Bank hdfc = new Bank("HDFC", "HDFC India Private Limited");

        // Create user
        User user = new User();

        // Create sender account
        long senderAccountNumber = 35089978098L;
        Account senderAccount = new Account(hdfc, user, senderAccountNumber, "SBIN0001088");

        // Create receiver account
        long receiverAccountNumber = 35089978098L;
        Account receiverAccount = new Account(hdfc, user, receiverAccountNumber, "SBIN0001098");

        // Create Amount
        Amount amount = new Amount(9000, Currency.INR);

        // Create a transaction
        Transaction t = new Transaction(amount, senderAccount, receiverAccount, "Course Fees", PaymentMethod.NET_BANKING);

        user.create(t);
    }
}