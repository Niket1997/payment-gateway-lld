package transactionstates;

import enums.StateName;
import models.Account;

public class OnHoldTransaction extends State {
    public OnHoldTransaction() {
        name = StateName.ON_HOLD;
    }

    @Override
    public void notifyUsers(Account senderAccount, Account receiverAccount, State oldState) {
        if (oldState.name.equals(StateName.IN_PROGRESS)) {
            System.out.println("IN_PROGRESS transaction is ON_HOLD now!");
        } else {
            System.out.println("unnatural old state");
        }
    }
}
