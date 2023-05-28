
package homework1_accounttransactions;


public class TestAccountTransactions {
    public static void main(String[] args){
    CurrentAccount MyAccount = new CurrentAccount("Moaz", 1122,1000,1.5);
    MyAccount.deposit(300);
    MyAccount.deposit(400);
    MyAccount.deposit(500);
    MyAccount.withdraw(100);
    MyAccount.withdraw(200);
    MyAccount.withdraw(150);
    
    System.out.println("Customer name: " + MyAccount.getCustomerName() +" | Customer ID: "+ MyAccount.getId() +" | Account Created on: "+MyAccount.getDateCreated()+" \n BalanceSR: "+MyAccount.getBalance()+" \n Monthly Interest: "+MyAccount.getMonthlyInterest());
    for(int i = 0; i< MyAccount.transactions.size(); i++){
    System.out.println("Date: " + MyAccount.transactions.get(i).getTransactionDate() + " | Type:" + MyAccount.transactions.get(i).getTransactionType() + " | Amount: " + MyAccount.transactions.get(i).getAmount() + " | Balance: " + MyAccount.transactions.get(i).getBalance());}
    }
        }    

