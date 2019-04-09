package com.John;

public class BankAccount {

    private String name;
    private int accountNum;
    private double balance;
    private String email;
    private int phoneNum;

    public BankAccount(String name, int accountNum, double balance, String email, int phoneNum) {
        this.name = name;
        this.accountNum = accountNum;
        this.balance = balance;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public  BankAccount(){
        this("default name", 123456,
                100.00, "Non", 5555555);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void addMoney(double money){
        this.balance = balance + money;
        System.out.println("You now have $" + this.balance
        + " dollars in your account");
    }

    public void takeMoney(double money){
        if(this.balance >= money){
            this.balance = balance - money;
            System.out.println("You now have $" + this.balance
                    + " dollars in your account");
        }else{
            System.out.println("Not enough funds");
        }
    }
}
