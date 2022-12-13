package ruleengine;

import interfaces.IStrategy;
import models.Transaction;

public class RuleEngine {
    IStrategy strategy;

    public void setStrategy(IStrategy newStrategy) {
        strategy = newStrategy;
    }

    public boolean validate(Transaction t) {
        return strategy.validate(t);
    }

    public boolean isFraud(Transaction t) {
        return false;
    }
}
