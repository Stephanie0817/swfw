package org.example.app;

import org.example.cash.CashAccountingFactory;

public class MainApplication {
    public static void main(String[] args) {
        AppFunctionFactory factory = new CashAccountingFactory();
        AbstractView view = factory.createView();
        view.show();
    }
}