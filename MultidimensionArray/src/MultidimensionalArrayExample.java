<<<<<<< HEAD
/**
 * Created by Lap-Dagoberto on 28/09/2016.
 */
public class MultidimensionalArrayExample {



    public static void main(String[] args) {

        char[][] board = new char[3][3];

        board[0][0]= 'X';
        board[1][1]= 'W';
        board[2][0]= 'X';
        board[1][2]= 'O';
        board[2][2]= 'O';

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
             System.out.printf("[%d][%d] = %c\t",i,j,board[i][j]);

            }
            System.out.println();

        }

    }

}
=======
/**
 * Created by Lap-Dagoberto on 28/09/2016.
 */
public class MultidimensionalArrayExample {



    public static void main(String[] args) {

        char[][] board = new char[3][3];

        board[0][0]= 'X';
        board[1][1]= 'W';
        board[2][0]= 'X';
        board[1][2]= 'O';
        board[2][2]= 'O';

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
             System.out.printf("[%d][%d] = %c\t",i,j,board[i][j]);

            }
            System.out.println();

        }

    }

}
>>>>>>> origin/master
