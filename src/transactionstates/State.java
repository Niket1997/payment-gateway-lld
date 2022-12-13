package transactionstates;

import enums.StateName;
import models.Account;

public abstract class State {
    public abstract void notifyUsers(Account senderAccount, Account receiverAccount, State oldState);

    StateName name;

    public void setName(StateName name) {
        this.name = name;
    }
}
