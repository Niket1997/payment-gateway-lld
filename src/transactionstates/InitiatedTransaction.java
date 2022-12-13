package transactionstates;

import enums.StateName;
import models.Account;

public class InitiatedTransaction extends State {
    public InitiatedTransaction() {
        name = StateName.INITIATED;
    }

    @Override
    public void notifyUsers(Account senderAccount, Account receiverAccount, State oldState) {
        System.out.println("Initiated Transaction");
    }
}
