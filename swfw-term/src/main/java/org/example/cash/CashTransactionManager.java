package org.example.cash;

import org.example.app.AbstractManager;

import java.util.ArrayList;
import java.util.List;

public class CashTransactionManager implements AbstractManager {
    private List<CashTransaction> transactions = new ArrayList<>();

    public void addEntry(Object entry) {
        if (entry instanceof CashTransaction) {
            transactions.add((CashTransaction) entry);
        }
    }

    public List<Object> getAllEntries() {
        return new ArrayList<>(transactions);
    }
}