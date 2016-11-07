/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author Dagoberto
 */
public class Account {
    String number;
    double balance;
    String customerName;
    String email;
    String phoneNumber;
    
    public void deposit(double deposit){
        this.balance += deposit;
        System.out.println("Deposit of " +deposit + " completed, now balance is " +this.balance);
    }  
    
    public void withdraw (double withdraw){
        if (this.balance > withdraw){
            this.balance -= withdraw;
            System.out.println("Withdraw of " +withdraw + " completed, now balance is " +this.balance);
        }else
            System.out.println("Insuficient founds!");
    }
            
        

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
