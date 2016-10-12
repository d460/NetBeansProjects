<<<<<<< HEAD
package tictactoe;

/**
 * Created by Lap-Dagoberto on 28/09/2016.
 */
public class Board {

    public Marker[][] board;


    public Board(){

        this.board = new Marker[3][3];
        this.Clear();

    }

    public  Board(Marker[][] theboard){
        this.board = theboard;
    }

    public final void Clear(){

        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++) {
                this.board[i][j] =  Marker.EMPTY;
            }
        }

    }

    public void Draw(){

        System.out.printf("\n   0   1   2  \n");
        for (int i = 0; i < this.board.length; i++) {
            System.out.printf("%d ",i);
            for (int j = 0; j < this.board.length; j++) {
                if (j < this.board.length-1){
                    System.out.printf(" %s |",this.board[i][j]);
                } else {
                    System.out.printf(" %s",this.board[i][j]);
                }
            }
            System.out.printf("\n");
            if(i < this.board.length - 1){
                System.out.printf("   --+---+--\n");
            }
        }
    }

    public boolean Place (Marker marker, int row, int col){
        if(this.board[row][col] == Marker.EMPTY) {
            this.board[row][col] = marker;
            return true;
        }else {
            return false;
        }
    }

}
=======
package tictactoe;

/**
 * Created by Lap-Dagoberto on 28/09/2016.
 */
public class Board {

    public Marker[][] board;


    public Board(){

        this.board = new Marker[3][3];
        this.Clear();

    }

    public  Board(Marker[][] theboard){
        this.board = theboard;
    }

    public final void Clear(){

        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++) {
                this.board[i][j] =  Marker.EMPTY;
            }
        }

    }

    public void Draw(){

        System.out.printf("\n   0   1   2  \n");
        for (int i = 0; i < this.board.length; i++) {
            System.out.printf("%d ",i);
            for (int j = 0; j < this.board.length; j++) {
                if (j < this.board.length-1){
                    System.out.printf(" %s |",this.board[i][j]);
                } else {
                    System.out.printf(" %s",this.board[i][j]);
                }
            }
            System.out.printf("\n");
            if(i < this.board.length - 1){
                System.out.printf("   --+---+--\n");
            }
        }
    }

    public boolean Place (Marker marker, int row, int col){
        if(this.board[row][col] == Marker.EMPTY) {
            this.board[row][col] = marker;
            return true;
        }else {
            return false;
        }
    }

}
>>>>>>> origin/master
