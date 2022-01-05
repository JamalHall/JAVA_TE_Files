package com.techelevator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BankCustomer implements Accountable {

    //instance variables
    private String name;
    private String address;
    private String phoneNumber;


    List <Accountable> accounts = new ArrayList<Accountable>();


    //constructor
    public BankCustomer(){}


//        accounts.split((", /.'+"));
//        System.out.println(accounts);
//        public void addAccount(Accountable newAccount){
//            getAccounts() = getAccounts()+ " " + newAccount;
//        }



//methods
    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public int transferTo(BankAccount destinationAccount, int transferAmount) {
        return 0;
    }


    public boolean isVip() {
//        for(BankAccount totalAccounts : accounts) {
//            System.out.println(accounts);

 //       }
        return isVip();
    }

    public void addAccount(Accountable newAccount){

    }


    //getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAccounts() {
        return accounts;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

