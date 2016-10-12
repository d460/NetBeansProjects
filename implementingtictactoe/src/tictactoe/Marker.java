<<<<<<< HEAD
package tictactoe;

/**
 * Created by Lap-Dagoberto on 28/09/2016.
 */
public enum  Marker {
    X('X'), O('O'), EMPTY(' ');

    private char ch;

    Marker(char ch) {
        this.ch = ch;
    }

    @Override
    public String toString(){
        return String.format("%c",this.ch);
    }
}
=======
package tictactoe;

/**
 * Created by Lap-Dagoberto on 28/09/2016.
 */
public enum  Marker {
    X('X'), O('O'), EMPTY(' ');

    private char ch;

    Marker(char ch) {
        this.ch = ch;
    }

    @Override
    public String toString(){
        return String.format("%c",this.ch);
    }
}
>>>>>>> origin/master
