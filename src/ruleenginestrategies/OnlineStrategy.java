package ruleenginestrategies;

import interfaces.IStrategy;
import models.Transaction;

public class OnlineStrategy implements IStrategy {
    @Override
    public boolean validate(Transaction t) {
        return t.getAmount().getValue() <= 1000000;
    }
}
