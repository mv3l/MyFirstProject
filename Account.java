/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1_accounttransactions;

/**
 *
 * @author Moaz
 */
public class Account {
    private int id = 0; 
    private double balance = 0.0; 
    private static double annualInterestRate = 0.0; 
    private java.util.Date dateCreated;
    private String customerName; 
    public Account() { 
        dateCreated = new java.util.Date(); 
        } 
    public Account(int id, double balance, String customerName, double annualInterestRate) { 
        this(); 
        this.id = id; 
        this.balance = balance;
        this.customerName = customerName;
        Account.annualInterestRate = annualInterestRate;
      } 
    public int getId() { 
        return this.id; 
    } 
    public double getBalance() { 
        return this.balance; 
    } 
    public double getAnnualInterestRate() { 
        return annualInterestRate; 
    } 
    public String getDateCreated() { 
        return this.dateCreated.toString(); 
    }
    public String getCustomerName(){
    return this.customerName;
    }
    public void setId(int id) { 
        this.id = id; 
    } 
    public void setBalance(double balance) { 
        this.balance = balance;
}  
    public void setAnnualInterestRate(double annualInterestRate) { 
        Account.annualInterestRate = annualInterestRate; 
    } 
    public double getMonthlyInterestRate() { 
        return (annualInterestRate / 100) / 12 ; 
    } 
    public double getMonthlyInterest() { 
        return balance * getMonthlyInterestRate(); 
    } 
    public void withdraw(double amount) { 
        this.balance -= amount; 
    } 
    public void deposit(double amount) { 
        this.balance += amount; 
    }
    public void setCustomerName(String customerName){
    this.customerName = customerName;
    }}
