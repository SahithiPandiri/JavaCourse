package com.example.javapractice;
import java.util.*;
public class BankAccountDemo {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String owner=sc.nextLine();
        int balance=sc.nextInt();
        BankAccount newAccount=new BankAccount(owner,balance);
        newAccount.deposit(500);
    }
}
