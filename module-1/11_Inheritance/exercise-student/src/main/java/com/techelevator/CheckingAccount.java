package com.techelevator;

public class CheckingAccount extends BankAccount {


    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }


// Methods


    @Override
    public int withdraw(int amountToWithdraw) {
        int bal= getBalance();
        int overDraftCharge = 10;
        int x=0;
        if((bal-amountToWithdraw) <= -100.00){
             x= (bal);

        } else if((bal-amountToWithdraw)> 0){
             x= super.withdraw(bal-(amountToWithdraw));

        } else if((bal-amountToWithdraw)>= -100){
             x= super.withdraw( (-amountToWithdraw-overDraftCharge)*(-1));
        }
        return x;
        }

}
