package transactionstates;

import enums.StateName;
import models.Account;

public class FailedTransaction extends State {
    public FailedTransaction() {
        name = StateName.FAILED;
    }
    @Override
    public void notifyUsers(Account senderAccount, Account receiverAccount, State oldState) {
        switch (oldState.name) {
            case IN_PROGRESS -> System.out.println("The transaction is failed!");
            case ON_HOLD -> System.out.println("Sadly, failed the ON_HOLD transaction!");
            default -> System.out.println("unnatural old state");
        }
    }
}
