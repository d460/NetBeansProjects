<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Lap-Dagoberto on 06/10/2016.
 */
public class BasicFileIO {

    public static void main(String[] args) {

        File file = new File("test.txt");

        //Write your name and age to the file
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Dago");
            output.println("32");
            output.close();
        } catch (IOException e) {
            System.out.printf("File not found");
            System.out.println(e);
        }

        //Read from the file
        try {
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();

            System.out.printf("Name: %s, Age: %d\n", name, age);
        } catch (FileNotFoundException e) {
            System.out.printf("File not found");
            System.out.println(e);
        }
    }

}
=======
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Lap-Dagoberto on 06/10/2016.
 */
public class BasicFileIO {

    public static void main(String[] args) {

        File file = new File("test.txt");

        //Write your name and age to the file
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Dago");
            output.println("32");
            output.close();
        } catch (IOException e) {
            System.out.printf("File not found");
            System.out.println(e);
        }

        //Read from the file
        try {
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();

            System.out.printf("Name: %s, Age: %d\n", name, age);
        } catch (FileNotFoundException e) {
            System.out.printf("File not found");
            System.out.println(e);
        }
    }

}
>>>>>>> origin/master
