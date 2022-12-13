package models;

import java.util.UUID;

public class Account {
    String id;
    Bank bank;
    User user;
    long accountNumber;
    String IFSC;

    public Account(Bank bank, User user, long accountNumber, String IFSC) {
        this.bank = bank;
        this.user = user;
        this.accountNumber = accountNumber;
        this.IFSC = IFSC;
        id = UUID.randomUUID().toString();
    }
}
