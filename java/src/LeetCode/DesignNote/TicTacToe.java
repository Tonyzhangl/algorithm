package LeetCode.DesignNote;

/**
* @Description:    判定井字棋胜负,https://leetcode-cn.com/problems/design-tic-tac-toe/
* @Author:         kirago
* @CreateDate:     2020/1/10 2:44 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class TicTacToe {

    private int[][] board;
    private int len;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        board = new int[n][n];
        len = n;
    }

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        board[row][col] = player;
        if(check(row, col, player, len) == player) return player;
        return 0;
    }

    private int check(int row, int col, int player, int len) {
        if(rowCheck(row, player, len)) {
            return player;
        }else if (colCheck(col, player, len)) {
            return player;
        }else if (row == col && row + col == len -1) {
            if(diagonalCheck(player, len) || antiDiagonalCheck(player, len)){
                return player;
            }
        } else if(row == col){
            if(diagonalCheck(player, len)) {
                return player;
            }

        }
        else if(row + col == len-1)
        {
            if(antiDiagonalCheck(player, len))
            {
                return player;
            }
        }
        return 0;
    }

    private boolean rowCheck(int row, int player, int len) {
        for(int i=0;i<len;i++) {
            if(board[row][i] != player) {
                return false;
            }
        }
        return  true;
    }

    private boolean colCheck(int col, int player, int len) {
        for(int i=0;i<len;i++) {
            if(board[i][col] != player) {
                return false;
            }
        }
        return  true;
    }

    private boolean diagonalCheck(int player, int len) {
        for(int i=0;i<len;i++) {
            if(board[i][i] != player) {
                return false;
            }
        }
        return true;
    }

    private boolean antiDiagonalCheck(int player, int len) {
        for(int i=0;i<len;i++) {
            if(board[i][len-i-1] != player) {
                return false;
            }
        }
        return true;
    }

}
