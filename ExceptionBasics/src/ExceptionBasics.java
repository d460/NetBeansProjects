<<<<<<< HEAD
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Lap-Dagoberto on 05/10/2016 .
 */
public class ExceptionBasics {

//    public static void main(String[] args) {
//
//        int i = 0;
//        boolean done = false;
//        do {
//
//            try {
//                Scanner input = new Scanner(System.in);
//                System.out.printf("Enter an Integer: ");
//                i = input.nextInt();
//                done = true;
//            } catch (InputMismatchException e) {
//                System.out.printf("You didn't an Integer\n");
//            } finally {
//                System.out.printf("This happens whether exception occurs or not\n");
//            }
//
//        } while (!done);
//
//        System.out.printf("You entered %d\n", i);
//    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        System.out.printf("Enter an Integer between 1 and 10: ");
        try {
            i = input.nextInt();
            if (i < 1 || i > 10 ) throw new IntegerOutOfRangeException();
        } catch (InputMismatchException ex){
            System.out.printf("You didn't an Integer\n");
            System.out.println(ex);
        } catch (IntegerOutOfRangeException ex){
            System.out.printf("You input value is not in the specific range\n");
            System.out.println(ex);
        }

    }

}
=======
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Lap-Dagoberto on 05/10/2016 .
 */
public class ExceptionBasics {

//    public static void main(String[] args) {
//
//        int i = 0;
//        boolean done = false;
//        do {
//
//            try {
//                Scanner input = new Scanner(System.in);
//                System.out.printf("Enter an Integer: ");
//                i = input.nextInt();
//                done = true;
//            } catch (InputMismatchException e) {
//                System.out.printf("You didn't an Integer\n");
//            } finally {
//                System.out.printf("This happens whether exception occurs or not\n");
//            }
//
//        } while (!done);
//
//        System.out.printf("You entered %d\n", i);
//    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        System.out.printf("Enter an Integer between 1 and 10: ");
        try {
            i = input.nextInt();
            if (i < 1 || i > 10 ) throw new IntegerOutOfRangeException();
        } catch (InputMismatchException ex){
            System.out.printf("You didn't an Integer\n");
            System.out.println(ex);
        } catch (IntegerOutOfRangeException ex){
            System.out.printf("You input value is not in the specific range\n");
            System.out.println(ex);
        }

    }

}
>>>>>>> origin/master
