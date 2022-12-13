package transactionstates;

import enums.StateName;
import models.Account;

public class SuccessfulTransaction extends State {
    public SuccessfulTransaction() {
        name = StateName.SUCCESSFUL;
    }

    @Override
    public void notifyUsers(Account senderAccount, Account receiverAccount, State oldState) {
        switch (oldState.name) {
            case IN_PROGRESS -> System.out.println("Ahoy, completed the transaction!");
            case ON_HOLD -> System.out.println("Hurray, completed the ON_HOLD transaction!");
            default -> System.out.println("unnatural old state");
        }
    }
}
