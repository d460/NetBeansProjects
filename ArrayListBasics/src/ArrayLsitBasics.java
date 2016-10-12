import java.util.ArrayList;

/**
 * Created by Lap-Dagoberto on 05/10/2016.
 */
public class ArrayLsitBasics {

    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<Integer>();

        grades.add(90);
        grades.add(85);
        grades.add(70);

        for (int i = 0; i< grades.size() ; i++) {
            System.out.printf("Grade #%d == %d\n",i,grades.get(i) );

        }

        grades.remove(1);

    }

}
