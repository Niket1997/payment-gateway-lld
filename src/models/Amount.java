package models;

import enums.Currency;

public class Amount {
    double value;
    Currency currency;

    public double getValue() {
        return value;
    }

    public Amount(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }
}
