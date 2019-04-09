package com.John;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        BankAccount jAccount = new BankAccount();
                //"john lowery",
               //?? 12345678, 100.00,
                //"JML@gmail.com", 1231233);
        jAccount.setBalance(100.00);
        jAccount.setPhoneNum(9123463);
        jAccount.getBalance();
        jAccount.addMoney(200.50);
        jAccount.takeMoney(400.00);
        jAccount.takeMoney(175.75);
    }
}
