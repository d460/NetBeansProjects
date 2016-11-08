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
        
        
        VipCostumer select = new VipCostumer();
        System.out.println("\nName: " + select.getName() + 
                "\nCredit Limit: " + select.getCredit() + 
                "\nEmail: " +select.getEmail());
        System.out.println("==============================================");
        
        VipCostumer select2 = new VipCostumer("Abraham","correo@correo.com");
        System.out.println("Name: " + select2.getName() + 
                "\nCredit Limit: " + select2.getCredit() + 
                "\nEmail: " +select2.getEmail());
        System.out.println("==============================================");
        
        VipCostumer select3 = new VipCostumer("Magy",20000,"magy@correo.com");
        System.out.println("Name: " + select3.getName() + 
                "\nCredit Limit: " + select3.getCredit() + 
                "\nEmail: " +select3.getEmail());
        System.out.println("==============================================");
        
    }
    
}
