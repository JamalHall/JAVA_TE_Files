package com.techelevator;

public class CreditCardAccount implements Accountable {

    //instance variables
private String accountHolder;
private String accountNumber;
private int debt ;

    //constructor
    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.debt = 0;
    }

    public CreditCardAccount(String accountHolder, String accountNumber, int debt) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.debt = debt;
    }

    //methods
    @Override
    public int getBalance() {
        return getDebt()*(-1);
    }

    @Override
    public int transferTo(BankAccount destinationAccount, int transferAmount) {
        return getDebt();
    }

    public int pay(int amountToPay){
        debt -= amountToPay;
        return getDebt();
    }

    public int charge(int amountToCharge){
        debt += amountToCharge;
        return getDebt();
    }

    //getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }
}
