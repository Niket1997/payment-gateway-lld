package models;

import enums.PaymentMethod;
import transactionstates.InProgressTransaction;
import transactionstates.InitiatedTransaction;
import transactionstates.State;

import java.util.UUID;

public class Transaction {
    String id;
    State state;
    Amount amount;
    Account senderAccount;
    Account receiverAccount;
    String description;
    PaymentMethod paymentMethod;

    public Transaction(Amount amount, Account senderAccount, Account receiverAccount, String description, PaymentMethod paymentMethod) {
        this.amount = amount;
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.description = description;
        this.paymentMethod = paymentMethod;

        id = UUID.randomUUID().toString();
        state = new InitiatedTransaction();
    }

    public void setState(State newState) {
        State oldState = state;
        state = newState;
        state.notifyUsers(senderAccount, receiverAccount, oldState);
    }

    public Amount getAmount() {
        return amount;
    }

    public State getState() {
        return state;
    }
}
