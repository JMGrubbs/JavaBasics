package com.John;

import java.util.ArrayList;

public class Customers {

    private String name;
    private ArrayList<Double> transactions;

    public Customers(String name, double amount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(amount);
    }

    public void addTransaction(double amount){
        if(this.transactions.get(this.transactions.size() - 1) >= amount){
            System.out.println(amount + " added to account.");
            this.transactions.add(amount);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
