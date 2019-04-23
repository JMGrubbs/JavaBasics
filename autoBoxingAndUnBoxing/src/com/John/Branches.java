package com.John;

import java.util.ArrayList;

public class Branches {
    private String name;
    private ArrayList<Customers> branchs;

    public Branches(String name) {
        this.name = name;
        this.branchs = new ArrayList<Customers>();
    }


    public Customers addNewCustomer(String name, double amount){
        for(int i = 0; i < this.branchs.size(); i++){
            if(branchs.get(i).getName() == name){
                System.out.println("There is already a customer with this name!");
                return null;
            }
            else{
             continue;
            }
        }
        Customers newCust = new Customers(name, amount);
        System.out.println(name + " has been added to the database with an amount of " + newCust.getTransactions());
        return newCust;
    }

    public Double addTransition(Customers customer, double amount){
        customer.addTransaction(amount);
        System.out.println(amount + " Has been added to the account of " + customer.getName() +"!");
        return amount;
    }

    public Customers findCustomer(String custName){
       for(int i = 0; i < this.branchs.size(); i++){
            if(branchs.get(i).getName() == custName){
                return branchs.get(i);
            }
            else {
               continue;
            }
       }
        System.out.println("No Customer found with that name");
       return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customers> getBranchs() {
        return branchs;
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