package com.techelevator;

public class SavingsAccount extends BankAccount {


    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int bal = getBalance();
        int fee = 2;

        if ((bal - amountToWithdraw) < 0){
          return bal;

        } else if ((bal - amountToWithdraw) >= 150) {
               return super.withdraw( amountToWithdraw);

        } else if (bal-amountToWithdraw < 150 ){
           return super.withdraw((-amountToWithdraw - fee) * (-1));

        }
        return bal;
    }
}
