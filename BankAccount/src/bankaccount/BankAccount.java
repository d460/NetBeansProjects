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
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account client = new Account();
        
        client.setBalance(1000);
        System.out.println("Client balance: " +client.getBalance());
        
        client.deposit(250);
        client.withdraw(400);        
        client.withdraw(900);    
        
        
        
    }
    
}
