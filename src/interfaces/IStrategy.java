package interfaces;

import models.Transaction;

public interface IStrategy {
    boolean validate(Transaction t);
}
