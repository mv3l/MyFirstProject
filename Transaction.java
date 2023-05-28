/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1_accounttransactions;


/**
 *
 * @author Moaz
 */
public class Transaction {
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description = "";
    
    
    public Transaction(){
    date = new java.util.Date();
    }
    public Transaction(char type, double amount, double balance, String description){
        this();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    public String getTransactionDate(){
    return date.toString();
    }
    public String getTransactionType(){
    switch(type){
            case 'W':
                return "Withdrawl";
            case 'D':
                return "Deposit";
            default:
                return "Error: Unknown type of Transaction";
    }}
    public double getAmount(){
    return amount;
    }
    public double getBalance(){
    return balance;
    }
    public String getDescription(){
    return description;
    }
    public void setType(char type){
    this.type = type;
    }
    public void setAmount(double amount){
    this.amount = amount;
    }
    public void setBalance(double balance){
    this.balance = balance;
    }
    public void setDescription(String description){
    this.description = description;
    }
}
