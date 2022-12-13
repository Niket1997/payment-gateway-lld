package models;

import java.util.UUID;

public class Bank {
    String id;
    String name;
    String metadata;

    public Bank(String name, String metadata) {
        this.name = name;
        this.metadata = metadata;
        id = UUID.randomUUID().toString();
    }
}
