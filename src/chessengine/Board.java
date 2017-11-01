package chessengine;

/**
 *
 * @author Roy Hansen
 */

public class Board {
    private final int[][] board;
    
        public Board(){
            this.board = new int[8][8];
        }
        
        int[][] getBoard() {
            return this.board;
        }
    
}
