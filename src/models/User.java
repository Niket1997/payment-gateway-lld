package models;

import transactionstates.InProgressTransaction;
import transactionstates.SuccessfulTransaction;

import java.util.UUID;

public class User {
    String id;

    public User() {
        id = UUID.randomUUID().toString();
    }

    public void create(Transaction t) {
        t.setState(new InProgressTransaction());
        System.out.println("Created a transaction");
    }
}
