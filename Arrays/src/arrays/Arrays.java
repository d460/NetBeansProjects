/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Dagoberto
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] grades = new int[4];
        grades[0] = 77;
        grades[1] = 84;
        grades[2] = 80;
        grades[3] = 96;
        
        String[] students = new String[]{"Tom","Ed","Joe","Bob"};
        Double sum = 0.0;
        
        System.out.printf("#\tStudent\tGrade\n");
        System.out.printf("-\t-------\t-----\n");
        
        for (int i = 0; i < students.length; i++){
            System.out.printf("%d\t%s\t%d\n" ,i,students[i],grades[i]);
            sum += grades[i];
                     
        }
        
        Double average = sum/grades.length;
        System.out.printf("Class average: %.2f\n",average);        
    }
}
