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
public class VipCostumer {
    
    private String name;
    private double credit;
    private String email;

    public VipCostumer(String name, double credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }

    public VipCostumer(String name, String email) {
        this(name,15000,email);
    }

    public VipCostumer() {
        this("Dago", 10000, "dago@prueba.com");
    }
    

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
