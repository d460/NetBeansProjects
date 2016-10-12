import java.io.*;
import java.util.ArrayList;

/**
 * Created by Lap-Dagoberto on 06/10/2016.
 */
public class ObjectSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("Students.txt");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Dago",9.8));
        students.add(new Student("Tom",7.8));
        students.add(new Student("Dave",8.4));

        //Serialize the collection of students

        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(fo);

        for(Student s: students){
            output.writeObject(s);
        }
        output.close();
        fo.close();

        //Deserialize the file back into the Collection
        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(fi);

        ArrayList<Student> students2 = new ArrayList<Student>();

        try {
            while (true) {
                Student s = (Student)input.readObject();
                students2.add(s);
            }
        }catch (EOFException e){
        }

        for (Student s: students2) {
            System.out.printf("Name:%s GPA:%f\n",s.getName(), s.getGPA());
        }
    }
}
