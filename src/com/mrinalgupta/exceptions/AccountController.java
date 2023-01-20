package com.mrinalgupta.exceptions;

public class AccountController {
    private static final double MAX_AMOUNT = 100;
    public void withdraw(double amount) throws TooMuchMoneyWithdrawnException{
        if(amount > MAX_AMOUNT){
            throw new TooMuchMoneyWithdrawnException("Account has insufficient balance");
        }
    }

    public static void main(String[] args){
        AccountController c = new AccountController();
//        c.withdraw(200.00D);// not compiled because it ia a checked exception, and it is not tweaked,

      //
    }
}
