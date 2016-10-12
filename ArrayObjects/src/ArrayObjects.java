<<<<<<< HEAD
import java.util.Scanner;

/**
 * Created by Lap-Dagoberto on 28/09/2016.
 */
public class ArrayObjects {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int grade;
        String name;
        int tamaño;

        System.out.printf("Number of students: ");
        tamaño = input.nextInt();
        System.out.printf("Number of students: %d\n",tamaño);

        Student[] students = new Student[tamaño];

        for(int i= 0; i < students.length; i++) {
            System.out.printf("Enter student GRADE then NAME for student %d: ",i);
            grade = input.nextInt();
            name = input.nextLine();
            students[i] = new Student(name,grade);
        }

        System.out.printf("#\tStudents\tGrade\n");
        System.out.printf("-\t--------\t-----\n");

        for(int i= 0; i < students.length; i++){
            System.out.printf("%d\t%s\t%d\n",i,students[i].getName(),students[i].getGrade());
        }
    }


}
=======
import java.util.Scanner;

/**
 * Created by Lap-Dagoberto on 28/09/2016.
 */
public class ArrayObjects {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int grade;
        String name;
        int tamaño;

        System.out.printf("Number of students: ");
        tamaño = input.nextInt();
        System.out.printf("Number of students: %d\n",tamaño);

        Student[] students = new Student[tamaño];

        for(int i= 0; i < students.length; i++) {
            System.out.printf("Enter student GRADE then NAME for student %d: ",i);
            grade = input.nextInt();
            name = input.nextLine();
            students[i] = new Student(name,grade);
        }

        System.out.printf("#\tStudents\tGrade\n");
        System.out.printf("-\t--------\t-----\n");

        for(int i= 0; i < students.length; i++){
            System.out.printf("%d\t%s\t%d\n",i,students[i].getName(),students[i].getGrade());
        }
    }


}
>>>>>>> origin/master
