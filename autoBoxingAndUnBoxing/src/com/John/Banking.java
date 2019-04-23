package com.John;

import java.util.ArrayList;

public class Banking {
    private String name;
    private ArrayList<Branches> branchs;

    public Banking(String name) {
        this.name = name;
        this.branchs = new ArrayList<Branches>();
    }

    public Branches addNewBranch(String name){
        Branches newBranch = new Branches(name);
        return newBranch;
    }

    public Branches addCustomers(Branches branchName, String custName, double amount){
        int temp = branchs.indexOf(branchName);
        Branches branch = branchs.get(temp);
        branch.addNewCustomer(custName, amount);
        return branch;
    }

    public ArrayList<Customers> allBranchCustomers(Branches branchName){
        int temp = branchs.indexOf(branchName);
        Branches branch = branchs.get(temp);
        return branch.getBranchs();
    }

    public ArrayList<Customers> allBranchCustomersTransactions(Branches branchName){
        int temp = branchs.indexOf(branchName);
        Branches branch = branchs.get(temp);
        for(int i = 0; i < branch.getBranchs().size(); i++){
            System.out.println(branch.getBranchs().get(i).getName());
            System.out.println(branch.getBranchs().get(i).getTransactions());
        }
        return branch.getBranchs();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branches> getBranchs() {
        return branchs;
    }
}

