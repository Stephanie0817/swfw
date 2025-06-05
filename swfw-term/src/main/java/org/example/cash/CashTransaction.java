package org.example.cash;

import java.time.LocalDate;

public class CashTransaction {
    private String type;
    private String description;
    private double amount;
    private LocalDate date;

    public CashTransaction(String type, String description, double amount, LocalDate date) {
        this.type = type;
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public String getType() { return type; }
    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public LocalDate getDate() { return date; }
}