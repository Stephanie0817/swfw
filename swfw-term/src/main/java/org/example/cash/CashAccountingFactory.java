package org.example.cash;

import org.example.app.AbstractManager;
import org.example.app.AbstractView;
import org.example.app.AppFunctionFactory;

public class CashAccountingFactory implements AppFunctionFactory {
    private CashTransactionManager manager = new CashTransactionManager();

    public AbstractView createView() {
        return new CashTransactionView(manager);
    }

    public AbstractManager createManager() {
        return manager;
    }
}
