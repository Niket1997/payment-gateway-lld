package transactionstates;

import enums.StateName;
import models.Account;

public class InProgressTransaction extends State {
    public InProgressTransaction() {
        name = StateName.IN_PROGRESS;
    }
    @Override
    public void notifyUsers(Account senderAccount, Account receiverAccount, State oldState) {
        if (oldState.name.equals(StateName.ON_HOLD)) {
            System.out.println("ON_HOLD transaction is in progress now!");
        } else if (oldState.name.equals(StateName.INITIATED)) {
            System.out.println("Initiated transaction is in progress now!");
        } else {
            System.out.println("unnatural old state");
        }
    }
}
