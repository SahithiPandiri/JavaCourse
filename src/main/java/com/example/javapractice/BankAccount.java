package com.example.javapractice;

public class BankAccount {
   private  int balance=0;
    private  String owner="";
    public BankAccount(String owner){
        this.owner=owner;
        this.balance=0;
    }
    public BankAccount(String ownwer,int balance){
        this.owner=owner;
        this.balance=balance;
    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("balance after deposit is "+balance);
    }
    void withdraw(int amount){
        if(amount>balance){
            System.out.print("no sufficient funds");
        }
        balance-=amount;
        System.out.println("balance after deposit is "+balance);
    }

}
