/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Dagoberto
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        calcFeetAndInchesToCentimeters(100);
    }
    
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || ((inches < 0) || (inches > 12))){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12)*2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet " + inches + " inches = " + centimeters + " cm" );
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainigInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainigInches + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainigInches);
    }
    
       
    
}
