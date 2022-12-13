package ruleenginestrategies;

import interfaces.IStrategy;
import models.Transaction;

public class LooseStrategy implements IStrategy {
    @Override
    public boolean validate(Transaction t) {
        return true;
    }
}
