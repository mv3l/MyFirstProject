/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1_accounttransactions;

import java.util.ArrayList;

/**
 *
 * @author Moaz
 */
public class CurrentAccount extends Account{
    protected ArrayList<Transaction> transactions = new ArrayList<>();
    
    public CurrentAccount(String customerName, int id, double balance, double annualInterestRate){
        super(id,balance, customerName, annualInterestRate);
    }
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        transactions.add(new Transaction('W', amount, getBalance(), "Withdrawal Transaction"));
    }
    @Override
    public void deposit(double amount){
        super.deposit(amount);
        transactions.add(new Transaction('D', amount, getBalance(), "Deposit Transaction"));
    }

    
}
