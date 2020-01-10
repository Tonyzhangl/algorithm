package LeetCode.DesignNote;

public class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(3);
        ticTacToe.move(1,2,2);
        ticTacToe.move(0,2,1);
        ticTacToe.move(0,0,2);
        ticTacToe.move(2,0,1);
        ticTacToe.move(0,1,2);
        ticTacToe.move(1,1,1);
    }
}
